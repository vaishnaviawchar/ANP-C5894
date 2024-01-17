import { Component, OnInit } from '@angular/core';
import { Project } from '../project';
import { ActivatedRoute } from '@angular/router';
import { ProjectService } from '../project.service';

@Component({
  selector: 'app-project-view',
  templateUrl: './project-view.component.html',
  styleUrls: ['./project-view.component.css']
})
export class ProjectViewComponent implements OnInit
{

  projectId!: number;
  project!: Project;

  constructor(private route: ActivatedRoute, private projectService: ProjectService) {}

  ngOnInit(): void {
    // Get the leaveId from the route parameters
    this.route.params.subscribe(params => {
      // Assuming 'id' is the parameter name defined in your route configuration
      this.projectId = +params['projectId']; // Use '+' to convert string to number
      console.log('Project ID:', this.projectId);

      // Fetch leave details based on the obtained leaveId
      this.projectService.getProjectById(this.projectId).subscribe(
        data => {
          this.project = data;
          console.log('Project Details:', this.project);
        },
        error => {
          console.error('Error fetching Project details:', error);
        }
      );
    });
  }
}
