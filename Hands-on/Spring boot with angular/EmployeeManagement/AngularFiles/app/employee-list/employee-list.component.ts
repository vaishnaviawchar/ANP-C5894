import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { Department } from '../department';
import { DepartmentService } from '../department.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit
{
employees!: Employee[];
searchName: string = '';
selectedCity:string='';
constructor(private employeeService: EmployeeService, private router: Router)
{

}

ngOnInit():void
{
  this.getEmployees();
  
}

private getEmployees()
{
  this.employeeService.getEmployeeList().subscribe(data =>
    {

    this.employees=data;
  });
  
    
  
}
// Modify searchEmployeesByName to include fetching employees by department and city
searchEmployeesByName() {
  if (this.searchName.trim() !== '' || this.selectedCity.trim() !== '') {
    this.employeeService.getEmployeesByName(this.searchName).subscribe(
      (dataByName: any) => {
        // Handle results for searching by name
        this.employees = dataByName;
      },
      (errorByName: any) => {
        console.error('Error searching employees by name:', errorByName);
      }
    );

    // Additionally, fetch employees by city
    this.employeeService.getEmployeesByCity(this.selectedCity).subscribe(
      (dataByCity: any) => {
        // Handle results for searching by city
        this.employees = dataByCity;
      },
      (errorByCity: any) => {
        console.error('Error searching employees by city:', errorByCity);
      }
    );
  } else {
    // If both searchName and city are empty, fetch all employees
    this.getEmployees();
  }
}


employeeDetails(id:number)
{
  this.router.navigate(['employee-details',id]);
}

}


