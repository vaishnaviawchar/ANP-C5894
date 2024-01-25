import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatePatientdComponent } from './update-patientadmin.component';

describe('UpdatePatientdComponent', () => {
  let component: UpdatePatientdComponent;
  let fixture: ComponentFixture<UpdatePatientdComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdatePatientdComponent]
    });
    fixture = TestBed.createComponent(UpdatePatientdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
