import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OurdoctorsComponent } from './ourdoctors.component';

describe('OurdoctorsComponent', () => {
  let component: OurdoctorsComponent;
  let fixture: ComponentFixture<OurdoctorsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OurdoctorsComponent]
    });
    fixture = TestBed.createComponent(OurdoctorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
