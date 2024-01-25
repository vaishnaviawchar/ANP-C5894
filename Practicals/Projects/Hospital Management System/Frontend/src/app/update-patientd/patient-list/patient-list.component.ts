import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { Doctor } from '../doctor';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit
{
  searchText!: string;
  patients!: Patient[];
  filteredPatients: Patient[] = [];
 

  constructor(private patientService: PatientService, private router: Router,private doctorService: DoctorService) {}

  ngOnInit(): void {
    this.getPatients();
    this.filteredPatients = this.patients;
  }

  private getPatients() {
    this.patientService.getPatientlist().subscribe((data) => {
      console.log('Patients:', data);
      this.patients = data;
      this.mapDoctorRelationship(); // Call mapDoctorRelationship after fetching patients
    });
  }
  assignDoctor(id: number, did: number) {
    this.patientService.assignDoctorToPatient(id, did).subscribe(
      (response) => {
        console.log('Doctor assigned successfully:', response);
        this.getPatients();
      },
      (error) => {
        console.error('Error assigning doctor:', error);
      }
    );
  }

  private mapDoctorRelationship() {
    const doctorObservables = this.patients.map((patient) =>
      this.patientService.getDoctorById(patient.id)
    );

    forkJoin(doctorObservables).subscribe((doctors:Doctor[]) => {
      this.patients.forEach((patient, index) => {
        patient.doctor = doctors[index];
      });
    });
  }

  searchPatients() {
    // Assuming you have a service method to fetch patients by name
    this.patientService.getPatientDetails(this.searchText).subscribe(
      (patient: any) => {
        // Update the 'patients' array with the result
        this.patients = patient ? [patient] : [];
      },
      (error) => {
        console.error('Error fetching patients:', error);
        // Optionally, you can show a user-friendly error message or handle the error in a different way
        // For example:
        // this.errorMessage = 'An error occurred while fetching patients. Please try again.';
      }
    );
  }
  matchesSearchCriteria(patient: Patient): boolean {
    const searchLower = this.searchText.toLowerCase();
    return (
      patient.name.toLowerCase().includes(searchLower) ||
      patient.age.toString().includes(searchLower) ||
      // Add other properties as needed
      patient.blood.toLowerCase().includes(searchLower)
    );
  }
 

  updatePatient(id: number) {
    this.router.navigate(['/update-patient', id]);
  }

  deletePatient(id: number) {
    this.patientService.deletePatient(id).subscribe((data) => {
      console.log(data);
      this.getPatients();
    });
  }
  
  
}



