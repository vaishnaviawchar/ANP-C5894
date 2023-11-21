import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Department } from './department';
import { Employee } from './employee';


@Injectable({
  providedIn: 'root'
})
export class DepartmentService 
{
  private baseURL ="http://localhost:8080/api/v1/departments"

  constructor(private httpClient: HttpClient) { }

  getDeprtmentList(): Observable<Department[]>
  {
    return this.httpClient.get<Department[]>(`${this.baseURL}`);
  }

  createDepartment(department: Department): Observable<Object>
{
  return this.httpClient.post<Department>(`${this.baseURL}`,department);
}

getDepartmentById(id:number): Observable<Department>
{
  return this.httpClient.get<Department>(`${this.baseURL}/${id}`);
}

updateDepartment(id:number, department:Department): Observable<Object>
{
  return this.httpClient.put(`${this.baseURL}/${id}`,department);
}

deleteDepartment(id:number): Observable<object>
{
  return this.httpClient.delete(`${this.baseURL}/${id}`);
}
getDepartmentsByName(deptName: string):Observable<object>
{
  return this.httpClient.get(`${this.baseURL}/byName/${deptName}`);

}

}
