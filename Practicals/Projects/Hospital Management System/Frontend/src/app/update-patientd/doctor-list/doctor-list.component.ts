import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent implements OnInit
{
  did!:number;
  doctors!: Doctor[];

  constructor(private doctorService: DoctorService,
    private router: Router) { }

  ngOnInit(): void {

    this.getDoctor();

  }

  private getDoctor() {
    this.doctorService.getDoctorlist().subscribe((data) => {
      this.doctors = data;

      // Fetch assigned patients for each doctor
      this.doctors.forEach((doctor) => {
        this.getPatientsByDoctor(doctor);
      });
    });
  }

  private getPatientsByDoctor(doctor: Doctor) {
    this.doctorService.getPatientsByDoctor(doctor.did).subscribe(
      (patients) => {
        // Assign the associated patients to the doctor
        doctor.patients = patients;
      },
      (error) => console.error(`Error fetching patients for doctor ${doctor.did}:`, error)
    );
  }

updateDoctor(did: number){

  this.router.navigate(['/update-doctor', did]);

}

deleteDoctor(did: number){
  this.doctorService.deleteDoctor(did).subscribe( data => { 
    console.log(data);
    this.getDoctor();
  })
}



}
