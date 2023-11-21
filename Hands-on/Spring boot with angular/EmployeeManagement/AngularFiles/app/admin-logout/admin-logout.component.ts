import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';
import { AdminAuthService } from '../admin-auth.service';

@Component({
  selector: 'app-admin-logout',
  templateUrl: './admin-logout.component.html',
  styleUrls: ['./admin-logout.component.css']
})
export class AdminLogoutComponent implements OnInit {
  constructor(
    private adminAuthService: AdminAuthService,
    private adminService: AdminService,
    private router: Router
  ) {}

  ngOnInit() {}

  logoutAdmin() {
    this.adminService.logoutAdmin().subscribe(
      (data: any) => {
        console.log('Admin logout response:', data);
        if (data && data.status === 'success') {
          alert('Admin logout successful!');
          // Set the admin login status to false
          this.adminAuthService.setLoggedInStatus(false);
          // Navigate to the login page or any other appropriate page
          this.router.navigate(['/admin-login']);
        } else {
          alert('Admin logout failed. Please try again.');
        }
      },
      (error) => {
        console.error('Admin logout failed:', error);
        alert('Admin logout failed. Please try again.');
      }
    );
  }
}