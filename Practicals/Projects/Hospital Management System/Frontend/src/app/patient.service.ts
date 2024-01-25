import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from './patient';
import { Observable, catchError, throwError } from 'rxjs';
import { Appointment } from './appointment';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  
  
  private baseUrl = "http://localhost:8080/api/v1/patients";

  constructor(private httpClient: HttpClient) { }
  
  getPatientlist(): Observable<Patient[]> {
    return this.httpClient.get<Patient[]>(`${this.baseUrl}`);
  }

  createPatient(patient: Patient): Observable<Patient> {
    return this.httpClient.post<Patient>(`${this.baseUrl}`, patient);
  }

  getPatientById(id: number): Observable<Patient> {   
    return this.httpClient.get<Patient>(`${this.baseUrl}/${id}`);
  }

  updatePatient(id: number, patient: Patient): Observable<Object> {
    return this.httpClient.put(`${this.baseUrl}/${id}`, patient);
  }

  deletePatient(id: number): Observable<any> {
    return this.httpClient.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
  getPatientDetails(name: string): Observable<Patient> {
    return this.httpClient.get<Patient>(`${this.baseUrl}/byname/${name}`);
  }

  private allPatients: Patient[] = [];
  private loggedInPatients: Patient[] = [];

  registerPatient(patient: Patient) {
    const url = `${this.baseUrl}/register`;
    patient.isRegistered = true;
    this.allPatients.push(patient);
    // You might also want to send the registration request to the server here
  }

  // Method to log in a patient
  loginPatient(patient: Patient) {
    const url = `${this.baseUrl}/login`;
    const foundPatient = this.allPatients.find((p) => p === patient);

    if (foundPatient) {
      foundPatient.isLoggedIn = true;
    }
   
  }

  // Getter for all patients
  getAllPatients(): Patient[] {
    return this.allPatients;
  }

  // Getter for registered patients
  getRegisteredPatients(): Patient[] {
    return this.allPatients.filter((patient) => patient.isRegistered);
  }

  // Getter for logged-in patients
  getLoggedInPatients(): Patient[] {
    return this.allPatients.filter((patient) => patient.isLoggedIn);
  }
  getTotalPatients(): Observable<number> {
    const url = `${this.baseUrl}/total`;
    return this.httpClient.get<number>(url);
  }
  assignDoctorToPatient(id: number, did: number): Observable<any> {
    const url = `${this.baseUrl}/${id}/assignDoctor/${did}`;
    return this.httpClient.post(url, null).pipe(
      catchError((error: HttpErrorResponse) => {
        console.error(`Error assigning doctor: ${error.message}`);
        return throwError(error);
      })
    );
  }
  getDoctorById(id: number): Observable<Doctor> {
    return this.httpClient.get<Doctor>(`${this.baseUrl}/${id}/doctor`);
  }
  getAllDoctors(): Observable<Doctor[]> {
    const doctorURL = "http://localhost:8080/api/v1/doctors"; // Replace with your actual department URL
    return this.httpClient.get<Doctor[]>(doctorURL);
  }
  
}