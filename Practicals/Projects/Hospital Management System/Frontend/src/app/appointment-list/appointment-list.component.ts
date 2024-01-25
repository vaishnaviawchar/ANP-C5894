import { Component, OnInit } from '@angular/core';
import { Appointment } from '../appointment';
import { AppointmentService } from '../appointment.service';
import { Router } from '@angular/router';
import { catchError, throwError } from 'rxjs';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-appointment-list',
  templateUrl: './appointment-list.component.html',
  styleUrls: ['./appointment-list.component.css']
})
export class AppointmentListComponent implements OnInit
 {
  searchText!: string;
  appointments!: Appointment[];
  filteredAppointments: Appointment[] = [];

  constructor(private appointmentService: AppointmentService,
    private router: Router) { }

  ngOnInit(): void {

    this.getAppointments();
  }

  private getAppointments() {
    this.appointmentService.getAppointmentslist().subscribe(data => {this.appointments = data;
      });
  }

  searchAppointments() {
    // Assuming you have a service method to fetch patients by name
    this.appointmentService.getAppointmentByName(this.searchText).subscribe(
      (appointment: any) => {
        // Update the 'patients' array with the result
        this.appointments = appointment ? [appointment] : [];
      },
      (error) => {
        console.error('Error fetching patients:', error);
        // Optionally, you can show a user-friendly error message or handle the error in a different way
        // For example:
        // this.errorMessage = 'An error occurred while fetching patients. Please try again.';
      }
    );
  }
  matchesSearchCriteria(appointment: Appointment): boolean {
    const searchLower = this.searchText.toLowerCase();
    return (
      appointment.age.toLowerCase().includes(searchLower) ||
      appointment.symptoms.toString().includes(searchLower) ||
      // Add other properties as needed
      appointment.number.toLowerCase().includes(searchLower)
    );
  }
 
  deleteAppointment(id: number) {
    this.appointmentService.deleteAppointment(id).subscribe((data) => {
      console.log(data);
      this.getAppointments();
    });
  }
}