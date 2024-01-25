import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { ActivatedRoute, Router } from '@angular/router';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-medicine-listd',
  templateUrl: './medicine-listd.component.html',
  styleUrls: ['./medicine-listd.component.css']
})
export class MedicineListdComponent implements OnInit
{
  medicines!: Medicine[];

  constructor(private medicineService: MedicineService,
    private router: Router) { }

  ngOnInit(): void {

    this.getMedicines();

  }

  private getMedicines(){
    this.medicineService.getMedicineList().subscribe(data => {this.medicines = data;
    });

}

}
