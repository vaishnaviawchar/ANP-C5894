import { Component, OnInit } from '@angular/core';
import { Appointment } from '../appointment';
import { AppointmentService } from '../appointment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-appointment',
  templateUrl: './create-appointment.component.html',
  styleUrls: ['./create-appointment.component.css']
})
export class CreateAppointmentComponent implements OnInit {
  appointment: Appointment = new Appointment();

  constructor(private appointmentService: AppointmentService, private router: Router) { }

  ngOnInit(): void {
  }

  saveAppointment() {
    console.log('Request Payload:', this.appointment);
    this.appointmentService.createAppointment(this.appointment).subscribe(
      data => {
        window.alert('Your appointment has been booked successfully.');
        console.log(data);
        this.goToUserDash();
      },
      error => {
        console.error('Error creating appointment:', error);
        // Add more specific error handling or show a user-friendly message.
      }
    );
  }

  goToUserDash() {
    this.router.navigate(['/patient-dash']);
  }

  onSubmit() {
    console.log('Form submitted without including id:', this.appointment);
    this.saveAppointment();
  }

}