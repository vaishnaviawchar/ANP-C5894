import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientListadminComponent } from './patient-listadmin.component';

describe('PatientListadminComponent', () => {
  let component: PatientListadminComponent;
  let fixture: ComponentFixture<PatientListadminComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PatientListadminComponent]
    });
    fixture = TestBed.createComponent(PatientListadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
