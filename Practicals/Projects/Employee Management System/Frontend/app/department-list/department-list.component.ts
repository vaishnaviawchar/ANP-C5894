import { Component, OnInit } from '@angular/core';
import { Department } from '../department';
import { DepartmentService } from '../department.service';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit
{
  departments! : Department[];
  searchName: any;
  
  selectedEmployeeId: number | undefined;
  constructor(private departmentService: DepartmentService,private router: Router)
  {

  }
  
  ngOnInit(): void {
    this.getDepartments();
    
  }

  private getDepartments()
  {
    this.departmentService.getDeprtmentList().subscribe(data =>{
      this.departments=data;
    })
  }
  

  departmentDetails(id: number) {
    this.router.navigate(['department-details', id]);
  }

 //dify searchDepartmentsByName to include fetching departments by employee
 searchDepartmentsByName() {
  if (this.searchName.trim() !== '') {
    this.departmentService.getDepartmentsByName(this.searchName).subscribe(
      (data: any) => {
        this.departments = data;
      },
      (error: any) => {
        console.error('Error searching departments by name:', error);
      }
    );
  } 

 }
}