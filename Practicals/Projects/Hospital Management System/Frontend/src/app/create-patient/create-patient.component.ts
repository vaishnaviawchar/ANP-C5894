import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {
  patient: Patient = new Patient();
  doctors: any[] = [];

  constructor(
    private patientService: PatientService,
    private doctorService: DoctorService,
    private router: Router
  ) { }

  ngOnInit(): void {
    // Fetch doctors to populate a dropdown or any other UI element
    this.doctorService.getDoctorlist().subscribe(
      data => {
        this.doctors = data;
      },
      error => {
        console.error('Error fetching doctors:', error);
      }
    );
  }

  savePatient() {
    this.patientService.createPatient(this.patient).subscribe(
      createdPatient => {
        console.log('Patient created:', createdPatient);

        // If you have a selected doctor, assign it to the new patient
        if (this.patient.doctor) {
          this.patientService.assignDoctorToPatient(createdPatient.id, this.patient.doctor.did).subscribe(
            () => {
              console.log('Doctor assigned successfully.');
              this.goToPatientList();
            },
            error => {
              console.error('Error assigning doctor:', error);
            }
          );
        } else {
          this.goToPatientList();
        }
      },
      error => {
        console.error('Error creating patient:', error);
      }
    );
  }

  goToPatientList() {
    this.router.navigate(['/admindash']);
  }

  onSubmit() {
    console.log(this.patient);
    this.savePatient();
  }
}