import { Component, OnInit } from '@angular/core';
import { DepartmentService } from '../department.service';
import { Department } from '../department';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-update-department',
  templateUrl: './update-department.component.html',
  styleUrls: ['./update-department.component.css']
})
export class UpdateDepartmentComponent implements OnInit
{
  id!: number;
  department : Department = new Department();
  constructor(private departmentService : DepartmentService, private router:Router, private route:ActivatedRoute)
  {}

  ngOnInit(): void 
  {
    this.id=this.route.snapshot.params['id'];

    this.departmentService.getDepartmentById(this.id).subscribe(data=>{
      this.department=data;
    },error=>console.log(error));
    
  }

  onSubmit()
  {
    this.departmentService.updateDepartment(this.id,this.department).subscribe(data=>{
      this.goToDepartmentList();
    },error=> console.log(error));
  }

  goToDepartmentList()
  {
    this.router.navigate(['/departments'])
  }
}
