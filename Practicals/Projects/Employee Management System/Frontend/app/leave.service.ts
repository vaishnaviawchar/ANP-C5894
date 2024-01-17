import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Leave } from './leave';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {
private baseURL="http://localhost:8080/api/v1/Leaves"
  constructor(private httpClient: HttpClient) { }
  getLeaveList(): Observable<Leave[]>
  {
    return this.httpClient.get<Leave[]>(`${this.baseURL}`);
  }
  createLeave(leave: Leave): Observable<Leave>
  {
    return this.httpClient.post<Leave>(`${this.baseURL}`,leave);
  }
  getLeaveById(leaveId:number): Observable<Leave>
  {
    return this.httpClient.get<Leave>(`${this.baseURL}/${leaveId}`);
  }
  updateLeave(leave: Leave,leaveId:number): Observable<Object>
  {
    return this.httpClient.put(`${this.baseURL}/${leaveId}`,leave);
  }
  deleteleave(leaveId: number): Observable<Object>
  {
    return this.httpClient.delete(`${this.baseURL}/${leaveId}`);
  }
}
