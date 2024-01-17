import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  private apiUrl = 'http://localhost:8080/api/v1/admin'; 

  constructor(private http: HttpClient) { }

  loginAdmin(adminCredentials: { username: string, password: string }): Observable<any> {
    
    const loginUrl = `${this.apiUrl}/login`;

    // Send a POST request with the admin credentials
    return this.http.post(loginUrl, adminCredentials);
  }
  logoutAdmin(): Observable<any> {
    const logoutUrl = `${this.apiUrl}/logout`;

    // Send a POST request to logout
    return this.http.post(logoutUrl, {});
  }

}