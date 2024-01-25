import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { MedicineService } from '../medicine.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-medicine',
  templateUrl: './create-medicine.component.html',
  styleUrls: ['./create-medicine.component.css']
})
export class CreateMedicineComponent implements OnInit
{
  
  medicine: Medicine = new Medicine();
  constructor(private medicineService: MedicineService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveMedicine() {
    this.medicineService.createMedicine(this.medicine).subscribe(data => {
      console.log(data);
      this.goToMedicineList();
    }, 
    error => console.log(error));
  }

  goToMedicineList() {

    this.router.navigate(['/medicine-list']);

  }

  onSubmit() {
    
    console.log(this.medicine);
    this.saveMedicine();
  }


}
