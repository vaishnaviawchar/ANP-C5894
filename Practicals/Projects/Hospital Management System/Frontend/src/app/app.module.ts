import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { FormsModule } from '@angular/forms';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { ViewPatientComponent } from './view-patient/view-patient.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { AppointmentListComponent } from './appointment-list/appointment-list.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashComponent } from './admindash/admindash.component';
import { DocloginComponent } from './doclogin/doclogin.component';
import { DocdashComponent } from './docdash/docdash.component';
import { NewsfeedComponent } from './newsfeed/newsfeed.component';
import { HttpClientModule } from '@angular/common/http';
import { PatientDashComponent } from './patient-dash/patient-dash.component';
import { PatientLoginComponent } from './patient-login/patient-login.component';
import { PatientRegisterComponent } from './patient-register/patient-register.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { UpdatePatientdComponent } from './update-patientd/update-patientadmin.component';
import { PatientListadminComponent } from './patient-listadmin/patient-listadmin.component';
import { MedicineListdComponent } from './medicine-listd/medicine-listd.component';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { UpdateDoctorComponent } from './update-doctor/update-doctor.component';
import { ViewDoctorComponent } from './view-doctor/view-doctor.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { OurdoctorsComponent } from './ourdoctors/ourdoctors.component';


@NgModule({
  declarations: [
    AppComponent,
    CreateMedicineComponent,
    UpdateMedicineComponent,
    MedicineListComponent,
    CreatePatientComponent,
    UpdatePatientComponent,
    ViewPatientComponent,
    CreateAppointmentComponent,
    AppointmentListComponent,
    AdminloginComponent,
    AdmindashComponent,
    DocloginComponent,
    DocdashComponent,
    NewsfeedComponent,
    PatientDashComponent,
    PatientLoginComponent,
    PatientRegisterComponent,
    PatientListComponent,
    UpdatePatientdComponent,
    PatientListadminComponent,
    MedicineListdComponent,
    CreateDoctorComponent,
    DoctorListComponent,
    UpdateDoctorComponent,
    ViewDoctorComponent,
    AboutusComponent,
    OurdoctorsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
