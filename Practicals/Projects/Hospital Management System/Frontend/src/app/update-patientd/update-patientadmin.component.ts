import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-patientd',
  templateUrl: './update-patientd.component.html',
  styleUrls: ['./update-patientd.component.css']
})
export class UpdatePatientdComponent implements OnInit
{
  
  id!: number;
  patient: Patient = new Patient();
  patients!:Patient[];
  constructor(private patientService: PatientService,
    private route: ActivatedRoute,
    private router: Router) { }

 

  ngOnInit(): void {
 
    
    this.id = this.route.snapshot.params['id'];
    this.patientService.getPatientById(this.id).subscribe(data => {
      this.patient = data;
    }, error => console.log(error) );


  }
  
 

  onSubmit() {
    this.patientService.updatePatient(this.id, this.patient).subscribe(data => {
      this.goToPatientlist();
    }
    , error => console.log(error));
  }

  goToPatientlist() {
    this.router.navigate(['/docdash']);
  }

}
