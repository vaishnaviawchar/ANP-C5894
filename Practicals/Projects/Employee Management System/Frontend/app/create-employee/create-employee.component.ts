import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { Department } from '../department';
import { DepartmentService } from '../department.service';




@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
 
    employee: Employee = new Employee();
    departments: Department[] = [];
    constructor(private employeeService: EmployeeService,private departmentService: DepartmentService,
      private router: Router){ }
      ngOnInit(): void {
        // Fetch departments to populate a dropdown or any other UI element
        this.departmentService.getDeprtmentList().subscribe(
          data => {
            this.departments = data;
          },
          error => {
            console.error('Error fetching departments:', error);
          }
        );
      }
    
      saveEmployee() {
        this.employeeService.createEmployee(this.employee).subscribe(
          createdEmployee => {
            console.log('Employee created:', createdEmployee);
    
            // If you have a selected department, assign it to the new employee
            if (this.employee.department) {
              this.departmentService.getDepartmentById(this.employee.department.id).subscribe(
                department => {
                  this.employee.department = department;
                  this.employeeService.assignDepartmentToEmployee(createdEmployee.emp_id, this.employee.department.id).subscribe(
                    () => {
                      console.log('Department assigned successfully.');
                      this.goToEmployeeList();
                    },
                    error => {
                      console.error('Error assigning department:', error);
                    }
                  );
                },
                error => {
                  console.error('Error fetching department:', error);
                }
              );
            } else {
              this.goToEmployeeList();
            }
          },
          error => {
            console.error('Error creating employee:', error);
          }
        );
      }
      goToEmployeeList() {
        this.router.navigate(['/employees']);
      }
    
      onSubmit() {
        console.log(this.employee);
        this.saveEmployee();
      }
    
    }