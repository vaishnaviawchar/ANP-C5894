import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { AuthGaurdService } from './authguard.service';
import { NewsfeedComponent } from './newsfeed/newsfeed.component';
import { DocloginComponent } from './doclogin/doclogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { DocdashComponent } from './docdash/docdash.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { AdmindashComponent } from './admindash/admindash.component';
import { AppointmentListComponent } from './appointment-list/appointment-list.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { ViewPatientComponent } from './view-patient/view-patient.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { PatientRegisterComponent } from './patient-register/patient-register.component';
import { PatientLoginComponent } from './patient-login/patient-login.component';
import { PatientDashComponent } from './patient-dash/patient-dash.component';
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


const routes: Routes = [
  { path: '', component: NewsfeedComponent },
  { path: 'doclogin', component: DocloginComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'home', component: NewsfeedComponent },
  { path: 'create-patient', component: CreatePatientComponent, canActivate: [AuthGaurdService] },
  { path: 'docdash', component: DocdashComponent, canActivate: [AuthGaurdService] },
  { path: 'update-patient/:id', component: UpdatePatientComponent, canActivate: [AuthGaurdService] },
  { path: 'admindash', component: AdmindashComponent, canActivate: [AuthGaurdService] },
  { path: 'medicine-list', component: MedicineListComponent, canActivate: [AuthGaurdService] },
  { path: 'create-medicine', component: CreateMedicineComponent, canActivate: [AuthGaurdService] },
  { path: 'update-medicine/:id', component: UpdateMedicineComponent, canActivate: [AuthGaurdService] },
  { path: 'appointment-list', component: AppointmentListComponent, canActivate: [AuthGaurdService] },
  { path: 'create-appointment', component: CreateAppointmentComponent, canActivate: [AuthGaurdService] },
  { path: 'view-patient/:id', component: ViewPatientComponent },
  {path:'patient-dash', component:PatientDashComponent},
  {path:'patient-login',component:PatientLoginComponent},
  {path:'patient-register',component:PatientRegisterComponent},
  {path:'patient-list', component:PatientListComponent},
  {path:'update-patientadmin/:id', component:UpdatePatientdComponent},
  {path:'patient-listadmin',component:PatientListadminComponent},
  {path:'medicine-listd',component:MedicineListdComponent},
  {path:'create-doctor', component:CreateDoctorComponent},
  {path:'doctor-list', component: DoctorListComponent},
  {path:'update-doctor/:did', component:UpdateDoctorComponent},
  {path:'view-doctor/:did', component:ViewDoctorComponent},
  {path:'aboutus', component:AboutusComponent},
  {path:'ourdoctors',component:OurdoctorsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
