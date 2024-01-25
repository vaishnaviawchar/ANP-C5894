import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Appointment } from './appointment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  private baseUrl = "http://localhost:8080/api/v1/Appointment";


  constructor(private httpClient: HttpClient) { }

  getAppointmentslist(): Observable<Appointment[]> {
    return this.httpClient.get<Appointment[]>(`${this.baseUrl}`);
  }

  createAppointment(appointment: Appointment): Observable<Appointment> {
    return this.httpClient.post<Appointment>(`${this.baseUrl}`, appointment);
  }

  getAppointmentById(id: number): Observable<Appointment> {   
    return this.httpClient.get<Appointment>(`${this.baseUrl}/${id}`);
  }

  deleteAppointment(id: number): Observable<any> {
    return this.httpClient.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getTotalAppointments(): Observable<number> {
    const url = `${this.baseUrl}/total`;
    return this.httpClient.get<number>(url);
  }

  getAppointmentByName(name:string): Observable<Appointment>
  {
    return this.httpClient.get<Appointment>(`${this.baseUrl}/byName/${name}`)
  }

}