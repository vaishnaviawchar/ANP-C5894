import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee';
import { Department } from './department';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService 
{
  private baseURL = "http://localhost:8080/api/v1/employees";

  constructor(private httpClient: HttpClient) { }

  getEmployeeList(): Observable<Employee[]> 
  {
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

createEmployee(employee: Employee): Observable<Employee>
{
   
  return this.httpClient.post<Employee>(`${this.baseURL}`, employee);
}

getEmployeeById(id:number): Observable<Employee>
{
  return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
}

updateEmployee(id:number, employee:Employee): Observable<Object>
{
  
  return this.httpClient.put(`${this.baseURL}/${id}`,employee);
}

deleteEmployee(id:number): Observable<object>
{
  return this.httpClient.delete(`${this.baseURL}/${id}`);
}

getEmployeesByName(firstName: string):Observable<object>
{
  return this.httpClient.get(`${this.baseURL}/byName/${firstName}`);

}
getEmployeesByCity(city: string):Observable<object>
{
  return this.httpClient.get(`${this.baseURL}/byCityName/${city}`);

}
}