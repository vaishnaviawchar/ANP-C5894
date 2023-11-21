import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { CreateDepartmentComponent } from './create-department/create-department.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { UpdateDepartmentComponent } from './update-department/update-department.component';
import { DepartmentDetailsComponent } from './department-details/department-details.component';
import { HomeComponent } from './home/home.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminLogoutComponent } from './admin-logout/admin-logout.component';



const routes: Routes = [

  {path:'employees', component:EmployeeListComponent},
  { path: 'home', component: HomeComponent },
  { path: '', redirectTo: '/admin-login', pathMatch: 'full' },
  {path:'create-employee', component:CreateEmployeeComponent},
  {path:'update-employee/:id', component:UpdateEmployeeComponent},
  {path:'employee-details/:id', component:EmployeeDetailsComponent},
  {path:'create-department', component:CreateDepartmentComponent},
  {path:'departments', component:DepartmentListComponent},
  {path:'update-department/:id', component:UpdateDepartmentComponent},
  {path:'department-details/:id', component:DepartmentDetailsComponent},
  {path:'admin-login', component:AdminLoginComponent},
  {path:'admin-logout', component:AdminLogoutComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  
})
export class AppRoutingModule { }
