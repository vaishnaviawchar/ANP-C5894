import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-doctor',
  templateUrl: './update-doctor.component.html',
  styleUrls: ['./update-doctor.component.css']
})
export class UpdateDoctorComponent implements OnInit
{
  
  did!: number;
  doctor: Doctor = new Doctor();
  constructor(private doctorService:  DoctorService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.did = this.route.snapshot.params['did'];
    this.doctorService.getDoctorById(this.did).subscribe(data => {
      this.doctor = data;
    } 
    , error => console.log(error));
  }

  onSubmit() {
    this.doctorService.updateDoctor(this.did, this.doctor).subscribe(data => { 
      this.goToDoctorList();
    } 
    , error => console.log(error));

  }

  goToDoctorList() {
    this.router.navigate(['/doctor-list']);
  }

}
