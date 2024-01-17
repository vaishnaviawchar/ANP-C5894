import { Component, OnInit } from '@angular/core';
import { AdminAuthService } from '../admin-auth.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit
{
  constructor(public adminAuthService: AdminAuthService){}
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
