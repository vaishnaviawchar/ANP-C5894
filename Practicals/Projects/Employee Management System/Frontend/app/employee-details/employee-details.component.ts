import { Component, OnInit } from '@angular/core';
//import { ActivatedRoute } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { ActivatedRoute, Router } from '@angular/router'; 
import { Department } from '../department';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
  emp_id!: number;
  employee!: Employee;
  department!: Department;
  id: number | undefined = undefined;

  constructor(
    private route: ActivatedRoute,
    private employeeService: EmployeeService,
    private router: Router // Inject the Router service
  ) {
    this.employee = new Employee();
  }

  ngOnInit(): void {
    this.emp_id = +this.route.snapshot.params['emp_id'];
    this.getEmployeeDetails(); // Call the method
  }

  updateEmployee() {
    this.router.navigate(['update-employee', this.emp_id]);
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.emp_id).subscribe((data) => {
      console.log(data);
      this.router.navigate(['employees']);
    });
  }

  getEmployeeDetails() {
    this.emp_id = +this.route.snapshot.params['emp_id'];
  
    this.employeeService.getEmployeeById(this.emp_id).subscribe(
      (data) => {
        this.employee = data;
  
        // Fetch department details if available
        if (this.employee && this.employee.department) {
          // Log department details (optional)
          console.log('Department details:', this.employee.department);
  
          // Assign department to employee
          this.department = this.employee.department;
        }
      },
      (error) => {
        console.error('Error fetching employee details:', error);
      }
    );
  }
  
}
