import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Medicine } from './medicine';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MedicineService 
{

  private baseURL = "http://localhost:8080/api/v1/medicines";

  constructor(private httpClient: HttpClient) { }

  getMedicineList(): Observable<Medicine[]> 
  {
    return this.httpClient.get<Medicine[]>(`${this.baseURL}`);
  }

createMedicine(medicine: Medicine): Observable<Medicine>
{
   
  return this.httpClient.post<Medicine>(`${this.baseURL}`, medicine);
}

getMedicineById(id:number): Observable<Medicine>
{
  return this.httpClient.get<Medicine>(`${this.baseURL}/${id}`);
}

updateMedicine(id:number, medicine:Medicine): Observable<Object>
{
  
  return this.httpClient.put(`${this.baseURL}/${id}`,medicine);
}

deleteMedicine(id:number): Observable<any>
{
  return this.httpClient.delete(`${this.baseURL}/${id}`,{ responseType: 'text' });
}

getTotalMedicines(): Observable<any>
{
  return this.httpClient.get(`${this.baseURL}/total`);
}
}

