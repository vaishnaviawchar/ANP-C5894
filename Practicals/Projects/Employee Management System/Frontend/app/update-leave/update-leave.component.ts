import { Component, OnInit } from '@angular/core';
import { Leave } from '../leave';
import { LeaveService } from '../leave.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-leave',
  templateUrl: './update-leave.component.html',
  styleUrls: ['./update-leave.component.css']
})
export class UpdateLeaveComponent implements OnInit
{
  leaveId!: number;
  leave: Leave = new Leave();

  constructor(private leaveService: LeaveService, private router: Router, private route: ActivatedRoute)
  {

  }
  ngOnInit(): void {
    this.leaveId = +this.route.snapshot.params['leaveId'];

    if (isNaN(this.leaveId)) {
      console.error('Invalid leaveId:', this.leaveId);
      return;
    }

    this.leaveService.getLeaveById(this.leaveId).subscribe(
      (data) => {
        console.log('Fetched leave details:', data);
        this.leave = data;
      },
      (error) => console.error('Error fetching leave details:', error)
    );
  }
  
  onSubmit() {
    if (this.leaveId !== undefined) {
      this.leaveService.updateLeave( this.leave,this.leaveId).subscribe(
        (data) => {
          this.goToLeaveList();
        },
        (error) => {
          console.error('Error updating leave:', error);
        }
      );
    } else {
      console.error('Invalid leaveId:', this.leaveId);
      // Handle the case where leaveId is undefined
    }
  }
  goToLeaveList()
  {
    this.router.navigate(['/leave-list'])
  }



}