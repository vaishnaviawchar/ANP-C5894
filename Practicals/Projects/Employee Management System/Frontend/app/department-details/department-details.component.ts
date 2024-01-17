import { Component, OnInit } from '@angular/core';
import { Department } from '../department';
import { ActivatedRoute, Router } from '@angular/router';
import { DepartmentService } from '../department.service';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-department-details',
  templateUrl: './department-details.component.html',
  styleUrls: ['./department-details.component.css']
})
export class DepartmentDetailsComponent implements OnInit {
  id!: number;
  department!: Department;

  constructor(
    private route: ActivatedRoute,
    private departmentService: DepartmentService,
    private router: Router
  ) {
    this.department = new Department();
  }

  ngOnInit(): void {
    this.id = +this.route.snapshot.params['id'];

    this.departmentService.getDepartmentById(this.id).subscribe(
      (data) => {
        this.department = data;
        // Fetch associated employees for the department
        this.getEmployeesByDepartment();
      },
      (error) => console.log(error)
    );
  }

  getEmployeesByDepartment() {
    this.departmentService.getEmployeesByDepartment(this.id).subscribe(
      (employees) => {
        // Assign the associated employees to the department
        this.department.employees = employees;
      },
      (error) => console.error(`Error fetching employees for department ${this.id}:`, error)
    );
  }

  updateDepartment() {
    this.router.navigate(['update-department', this.id]);
  }

  deleteDepartment() {
    this.departmentService.deleteDepartment(this.id).subscribe((data) => {
      console.log(data);
      this.router.navigate(['departments']);
    });
  }
}
