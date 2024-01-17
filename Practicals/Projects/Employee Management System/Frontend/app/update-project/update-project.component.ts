import { Component, OnInit } from '@angular/core';
import { Project } from '../project';
import { ActivatedRoute, Router } from '@angular/router';
import { ProjectService } from '../project.service';

@Component({
  selector: 'app-update-project',
  templateUrl: './update-project.component.html',
  styleUrls: ['./update-project.component.css']
})
export class UpdateProjectComponent implements OnInit
{
  projectId!: number;
  project: Project = new Project();

  constructor(private projectService: ProjectService, private router: Router, private route: ActivatedRoute)
  {

  }
  ngOnInit(): void {
    this.projectId = +this.route.snapshot.params['projectId'];

    if (isNaN(this.projectId)) {
      console.error('Invalid projectId:', this.projectId);
      return;
    }

    this.projectService.getProjectById(this.projectId).subscribe(
      (data) => {
        console.log('Fetched Project details:', data);
        this.project = data;
      },
      (error) => console.error('Error fetching leave details:', error)
    );
  }
  
  onSubmit() {
    if (this.projectId !== undefined) {
      this.projectService.updateProject( this.project,this.projectId).subscribe(
        (data) => {
          this.goToProjectList();
        },
        (error) => {
          console.error('Error updating Project:', error);
        }
      );
    } else {
      console.error('Invalid leaveId:', this.projectId);
      // Handle the case where leaveId is undefined
    }
  }
  goToProjectList()
  {
    this.router.navigate(['/project-list'])
  }


}
