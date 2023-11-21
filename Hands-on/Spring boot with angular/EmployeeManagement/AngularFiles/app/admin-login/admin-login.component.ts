import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { AdminAuthService } from '../admin-auth.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  admin: Admin = new Admin();
  isLoggedIn$: Observable<boolean>; 
  constructor(
    private adminService: AdminService,
    private router: Router,
    public adminAuthService: AdminAuthService
  ) {this.isLoggedIn$ = this.adminAuthService.isLoggedIn$;}

  ngOnInit(): void {}

  loginAdmin() {
    this.adminService.loginAdmin(this.admin).subscribe(
      (data: any) => {
        console.log('Admin login response:', data);
        if (data && data.status === 'success') {
          alert('Admin login successful!');
          // Set the admin login status
          this.adminAuthService.setLoggedInStatus(true);
          // Navigate to the home page
          this.router.navigate(['/home']);
        } else {
          alert('Admin login failed. Please check your credentials.');
        }
      },
      (error) => {
        console.error('Admin login failed:', error);
        alert('Admin login failed. Please check your credentials.');
      }
    );
  }
  logoutAdmin() {
    // Check if the admin is logged in
    this.isLoggedIn$.subscribe((isLoggedIn) => {
      if (isLoggedIn) {
        // If logged in, perform the logout logic
        this.adminService.logoutAdmin().subscribe(
          (data: any) => {
            console.log('Admin logout response:', data);
            if (data && data.status === 'success') {
              alert('Admin logout successful!');
              // Navigate to the logout page or any other appropriate page
              this.router.navigate(['/admin-logout']); // Change this to the desired route
            } else {
              alert('Admin logout failed. Please try again.');
            }
          },
          (error) => {
            console.error('Admin logout failed:', error);
            alert('Admin logout failed. Please try again.');
          }
        );
      } else {
        // If not logged in, you can handle this case accordingly
        console.log('Admin is not logged in.');
      }
    });
  }
}
