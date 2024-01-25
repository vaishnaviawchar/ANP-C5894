import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService 
{
  private baseUrl = "http://localhost:8080/api/v1/doctors";
  
    constructor(private httpClient: HttpClient) { }
    
    getDoctorlist(): Observable<Doctor[]> 
    {
      return this.httpClient.get<Doctor[]>(`${this.baseUrl}`);
    }
  
    createDoctor(doctor: Doctor): Observable<Doctor> {
      return this.httpClient.post<Doctor>(`${this.baseUrl}`, doctor);
    }
  
    getDoctorById(did: number): Observable<Doctor> {   
      return this.httpClient.get<Doctor>(`${this.baseUrl}/${did}`);
    }
  
    updateDoctor(did: number, doctor: Doctor): Observable<Doctor> {
      return this.httpClient.put<Doctor>(`${this.baseUrl}/${did}`, doctor);
    }
  
    deleteDoctor(did: number): Observable<Object> {
      return this.httpClient.delete(`${this.baseUrl}/${did}`,{ responseType: 'text' });
    }
    getTotalDoctors(): Observable<number> {
      const url = `${this.baseUrl}/total`;
      return this.httpClient.get<number>(url);
    }
    getPatientsByDoctor(did: number): Observable<any> {
      return this.httpClient.get(`${this.baseUrl}/${did}/patients`);
    }
   
  }
  
  