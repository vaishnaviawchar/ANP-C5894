import { Component, OnInit } from '@angular/core';
import { Leave } from '../leave';
import { ActivatedRoute } from '@angular/router';
import { LeaveService } from '../leave.service';

@Component({
  selector: 'app-view-leave',
  templateUrl: './view-leave.component.html',
  styleUrls: ['./view-leave.component.css']
})
export class ViewLeaveComponent implements OnInit {
  leaveId!: number;
  leave!: Leave;

  constructor(private route: ActivatedRoute, private leaveService: LeaveService) {}

  ngOnInit(): void {
    // Get the leaveId from the route parameters
    this.route.params.subscribe(params => {
      // Assuming 'id' is the parameter name defined in your route configuration
      this.leaveId = +params['leaveId']; // Use '+' to convert string to number
      console.log('Leave ID:', this.leaveId);

      // Fetch leave details based on the obtained leaveId
      this.leaveService.getLeaveById(this.leaveId).subscribe(
        data => {
          this.leave = data;
          console.log('Leave Details:', this.leave);
        },
        error => {
          console.error('Error fetching leave details:', error);
        }
      );
    });
  }
}
