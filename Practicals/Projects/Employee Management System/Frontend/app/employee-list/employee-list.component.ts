import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { Department } from '../department';
import { DepartmentService } from '../department.service';
import { forkJoin } from 'rxjs';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit
{
  employees!: Employee[];
  searchName: string = '';
  selectedCity: string = '';

  constructor(private employeeService: EmployeeService, private router: Router) {}

  ngOnInit(): void {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService.getEmployeeList().subscribe(data => {
      this.employees = data;
      this.mapDepartmentRelationship(); // Call mapDepartmentRelationship after fetching employees
    });
  }

  searchEmployeesByName() {
    if (this.searchName.trim() !== '' || this.selectedCity.trim() !== '') {
      this.employeeService.getEmployeesByName(this.searchName).subscribe(
        (dataByName: any) => {
          this.employees = dataByName;
          this.mapDepartmentRelationship();
        },
        (errorByName: any) => {
          console.error('Error searching employees by name:', errorByName);
        }
      );

      this.employeeService.getEmployeesByCity(this.selectedCity).subscribe(
        (dataByCity: any) => {
          this.employees = dataByCity;
          this.mapDepartmentRelationship();
        },
        (errorByCity: any) => {
          console.error('Error searching employees by city:', errorByCity);
        }
      );
    } else {
      this.getEmployees();
    }
  }

  assignDepartment(emp_id: number, id: number) {
    this.employeeService.assignDepartmentToEmployee(emp_id, id).subscribe(
      (response) => {
        console.log('Department assigned successfully:', response);
        this.getEmployees();
      },
      (error) => {
        console.error('Error assigning department:', error);
      }
    );
  }

  private mapDepartmentRelationship() {
    const departmentObservables = this.employees.map((employee) =>
      this.employeeService.getDepartmentById(employee.emp_id)
    );

    forkJoin(departmentObservables).subscribe((departments: Department[]) => {
      this.employees.forEach((employee, index) => {
        employee.department = departments[index];
      });
    });
  }

  employeeDetails(emp_id: number) {
    this.router.navigate(['employee-details', emp_id]);
  }
}