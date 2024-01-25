import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicineListdComponent } from './medicine-listd.component';

describe('MedicineListdComponent', () => {
  let component: MedicineListdComponent;
  let fixture: ComponentFixture<MedicineListdComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MedicineListdComponent]
    });
    fixture = TestBed.createComponent(MedicineListdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
