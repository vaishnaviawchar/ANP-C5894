import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { ActivatedRoute } from '@angular/router';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-view-doctor',
  templateUrl: './view-doctor.component.html',
  styleUrls: ['./view-doctor.component.css']
})
export class ViewDoctorComponent implements OnInit
{
  did!: number;
  doctor!: Doctor;
  constructor(private route: ActivatedRoute, private doctorService: DoctorService) { }

  ngOnInit(): void {

    this.did = this.route.snapshot.params['did'];
    this.doctor = new Doctor();
    this.doctorService.getDoctorById(this.did).subscribe(data => { 
      this.doctor = data;
    } );
  }

}
