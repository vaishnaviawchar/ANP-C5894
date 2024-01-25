import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';
import { AppointmentService } from '../appointment.service';
import { DoctorService } from '../doctor.service';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-admindash',
  templateUrl: './admindash.component.html',
  styleUrls: ['./admindash.component.css']
})
export class AdmindashComponent implements OnInit 
{
  totalAppointments: number = 0;
  totalPatients :number=0;
  totalDoctors :number=0;
  totalMedicines:number=0;
  constructor(private appointmentService: AppointmentService, private patientService:PatientService,private doctorService: DoctorService,private medicineService:MedicineService) { }

  ngOnInit(): void {
   this.fetchTotalAppointments();
   this.fetchTotalPatients();
   this.fetchTotalDoctors();
   this.fetchTotalMedicines();
  }
  fetchTotalAppointments() {
    this.appointmentService.getTotalAppointments().subscribe(
      (count: number) => this.totalAppointments = count,
      (error: any) => console.error('Error fetching total appointments:', error)
    );
  }
  fetchTotalPatients()
  {
    this.patientService.getTotalPatients().subscribe(
      (count: number) => this.totalPatients = count,
      (error: any) => console.error('Error fetching total Patients:', error)
    );
  }
  fetchTotalDoctors()
  {
    this.doctorService.getTotalDoctors().subscribe(
      (count: number) => this.totalDoctors = count, 
      (error:any) => console.error('Error fetching total Doctors:', error)
    );
  }

  fetchTotalMedicines()
  {
    this.medicineService.getTotalMedicines().subscribe(
      (count: number) => this.totalMedicines = count, 
      (error:any) => console.error('Error fetching total Medicines:', error)
    );
  }

}


