import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from '../doctor';

@Component({
  selector: 'app-update-patient',
  templateUrl: './update-patient.component.html',
  styleUrls: ['./update-patient.component.css']
})
export class UpdatePatientComponent implements OnInit
 {
  did!:number;
  id!: number;
  patient: Patient = new Patient();
  patients!:Patient[];
  doctors:Doctor[]=[];
  constructor(private patientService: PatientService,
    private route: ActivatedRoute,
    private router: Router) { }

    ngOnInit(): void {
      this.id = this.route.snapshot.params['id'];
  
      // Fetch employee details
      this.patientService.getPatientById(this.id).subscribe(
        (data) => {
          this.patient = data;
        },
        (error) => console.log(error)
      );
  
      // Fetch departments for dropdown
      this.patientService.getAllDoctors().subscribe(
        (data) => {
          this.doctors = data;
        },
        (error) => console.log(error)
      );
    }
  
    onSubmit() {
      // Update the employee details
      this.patientService.updatePatient(this.id, this.patient).subscribe(
        (data) => {
          // Check if departmentId is defined before updating the department
          if (this.id !== undefined) {
            this.patientService.assignDoctorToPatient(this.id, this.did).subscribe(
              (response) => {
                console.log('Doctor assigned successfully:', response);
                this.goToPatientlist();
              },
              (error) => {
                console.error('Error assigning department:', error);
              }
            );
          } else {
            console.error('DoctorId is not defined.');
            this.goToPatientlist();
          }
        },
        (error) => console.log(error)
      );
    }
  

  goToPatientlist() {
    this.router.navigate(['/patient-list']);
  }

  
}