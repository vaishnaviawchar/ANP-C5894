import { Component, OnInit } from '@angular/core';
//import { ActivatedRoute } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { ActivatedRoute, Router } from '@angular/router'; 

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit
{
  id!: number;
  employee!: Employee;

  constructor(
    private route: ActivatedRoute,
    private employeeService: EmployeeService,
    private router: Router // Inject the Router service
  ) {
    this.employee = new Employee();
  }

  ngOnInit(): void {
    this.id = +this.route.snapshot.params['id'];

    this.employeeService.getEmployeeById(this.id).subscribe(
      (data) => {
        this.employee = data;
      },
      (error) => console.log(error)
    );
  }

  updateEmployee() {
    this.router.navigate(['update-employee', this.id]);
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.id).subscribe((data) => {
      console.log(data);
      // You can navigate to a different page after deletion, e.g., back to the employee list
      this.router.navigate(['employees']);
    });
  }
}