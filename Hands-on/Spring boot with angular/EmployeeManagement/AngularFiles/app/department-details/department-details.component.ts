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
export class DepartmentDetailsComponent implements OnInit
{

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
      },
      (error) => console.log(error)
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