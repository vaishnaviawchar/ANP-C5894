import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-register',
  templateUrl: './patient-register.component.html',
  styleUrls: ['./patient-register.component.css']
})
export class PatientRegisterComponent implements OnInit
{
  patient: Patient = new Patient();
  
    constructor(private patientService: PatientService, private router: Router) { }
  
    ngOnInit(): void {}
  
    patientRegister() {
      this.patientService.registerPatient(this.patient);
  
      // Assuming the patient is now registered and the service has updated the patient list
      const registeredPatients = this.patientService.getRegisteredPatients();
  
      // You might want to perform additional actions here based on the registered patients
  
      alert('User is registered successfully!');
  
      // After successful registration, navigate to the login page
      this.router.navigate(['/patient-login']);
    }
  }

