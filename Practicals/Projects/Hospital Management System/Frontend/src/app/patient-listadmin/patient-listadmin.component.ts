import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-listadmin',
  templateUrl: './patient-listadmin.component.html',
  styleUrls: ['./patient-listadmin.component.css']
})
export class PatientListadminComponent implements OnInit
{
  searchText!: string;
  patients!: Patient[];
  filteredPatients: Patient[] = [];
 

  constructor(private patientService: PatientService, private router: Router) {}

  ngOnInit(): void {
    this.getPatients();
    this.filteredPatients = this.patients;
  }

  private getPatients() {
    this.patientService.getPatientlist().subscribe((data) => {
      this.patients = data;
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
    this.router.navigate(['/update-patientadmin', id]);
  }

  deletePatient(id: number) {
    this.patientService.deletePatient(id).subscribe(
      (response) => {
        console.log('Response:', response);
        // Handle success, e.g., show a success message
      },
      (error) => {
        console.error('Error:', error);
        // Handle error, e.g., show an error message
      }
    );
  }
  
  

}
