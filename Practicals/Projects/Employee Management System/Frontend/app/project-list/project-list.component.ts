import { Component, OnInit } from '@angular/core';
import { Project } from '../project';
import { ProjectService } from '../project.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.css']
})
export class ProjectListComponent implements OnInit {
  projects: Project[] = [];
  searchName: any;
  selectedName: any;

  constructor(private projectService: ProjectService, private router: Router) {}

  ngOnInit(): void {
    this.getProject();
  }

  private getProject() {
    this.projectService.getProjectList().subscribe(
      (data: Project[]) => {
        this.projects = data;
      },
      (error: any) => {
        console.error('Error fetching projects:', error);
      }
    );
  }

  searchProjectByName() {
    if (this.searchName.trim() !== '') {
      this.projectService.getProjectByName(this.searchName).subscribe(
        (data: any) => {
          this.projects = data;
        },
        (error: any) => {
          console.error('Error searching Projects by name:', error);
        }
      );
    } 
  
   }
   searchProjectByDEpartmentName() {
    if (this.selectedName.trim() !== '') {
      this.projectService.getProjectByDepartment(this.selectedName).subscribe(
        (data: any) => {
          this.projects = data;
        },
        (error: any) => {
          console.error('Error searching Projects by name:', error);
        }
      );
    } 
  
   }
  projectDetails(projectId: number) {
    this.router.navigate(['project-view', projectId]);
  }

  updateProject(projectId: number) {
    this.router.navigate(['update-project', projectId]);
  }

  deleteProject(projectId: number) {
    this.projectService.deleteProject(projectId).subscribe(
      (data) => {
        console.log(data);
        this.getProject();
      },
      (error) => {
        console.error('Error deleting project:', error);
      }
    );
  }
}
