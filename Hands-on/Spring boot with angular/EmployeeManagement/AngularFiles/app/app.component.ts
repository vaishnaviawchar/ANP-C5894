import { Component } from '@angular/core';
import { AdminAuthService } from './admin-auth.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = '';
  constructor(public adminAuthService: AdminAuthService) {}
 
}
