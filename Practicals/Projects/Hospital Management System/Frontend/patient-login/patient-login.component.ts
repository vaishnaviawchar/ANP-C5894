import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-login',
  templateUrl: './patient-login.component.html',
  styleUrls: ['./patient-login.component.css']
})
export class PatientLoginComponent implements OnInit
{
  patient: Patient = new Patient();

  constructor(private patientService: PatientService, private router: Router) { }

  ngOnInit(): void {}

  login() {
    this.patientService.loginPatient(this.patient);

    // Assuming the patient is now logged in and the service has updated the patient list
    const loggedInPatients = this.patientService.getLoggedInPatients();

    // You might want to perform additional actions here based on the logged-in patients

    alert('User is logged in successfully!');

    // After successful login, navigate to the patient dashboard
    this.router.navigate(['/patient-dash']);
  }
}





