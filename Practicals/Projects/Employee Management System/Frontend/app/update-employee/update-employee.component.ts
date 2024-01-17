import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { take } from 'rxjs/operators';
import { Department } from '../department';
import { DepartmentService } from '../department.service';


@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  emp_id!: number;
  employee: Employee = new Employee();
  id!: number;
  departments: Department[] = []; // Define the departments array

  constructor(
    private employeeService: EmployeeService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.emp_id = this.route.snapshot.params['emp_id'];

    // Fetch employee details
    this.employeeService.getEmployeeById(this.emp_id).subscribe(
      (data) => {
        this.employee = data;
      },
      (error) => console.log(error)
    );

    // Fetch departments for dropdown
    this.employeeService.getAllDepartments().subscribe(
      (data) => {
        this.departments = data;
      },
      (error) => console.log(error)
    );
  }

  onSubmit() {
    // Update the employee details
    this.employeeService.updateEmployee(this.emp_id, this.employee).subscribe(
      (data) => {
        // Check if departmentId is defined before updating the department
        if (this.id !== undefined) {
          this.employeeService.assignDepartmentToEmployee(this.emp_id, this.id).subscribe(
            (response) => {
              console.log('Department assigned successfully:', response);
              this.goToEmployeeList();
            },
            (error) => {
              console.error('Error assigning department:', error);
            }
          );
        } else {
          console.error('DepartmentId is not defined.');
          this.goToEmployeeList();
        }
      },
      (error) => console.log(error)
    );
  }

  goToEmployeeList() {
    this.router.navigate(['/employees']);
  }
}
