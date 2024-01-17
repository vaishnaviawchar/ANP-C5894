import { Component, OnInit } from '@angular/core';
import { Leave } from '../leave';
import { LeaveService } from '../leave.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-leave-list',
  templateUrl: './leave-list.component.html',
  styleUrls: ['./leave-list.component.css']
})
export class LeaveListComponent  implements OnInit
{
  leaves!: Leave[];
  constructor(private leaveService: LeaveService, private router: Router)
  {

  }

  ngOnInit():void
  {
    this.getLeaves();
  }

  private getLeaves()
  {
    this.leaveService.getLeaveList().subscribe(data =>
      {

      this.leaves=data;
    });
    
      
    
  }

  leaveDetails(leaveId:number)
  {
    this.router.navigate(['view-leave',leaveId]);
  }
  updateLeave(leaveId:number)
  {
    this.router.navigate(['update-leave',leaveId]);

  }
  deleteLeave(leaveId:number)
  {
    this.leaveService.deleteleave(leaveId).subscribe(data=>{console.log(data);this.getLeaves();})
  }

}
