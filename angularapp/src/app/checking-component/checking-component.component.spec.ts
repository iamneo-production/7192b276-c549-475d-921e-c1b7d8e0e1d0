import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckingComponentComponent } from './checking-component.component';

describe('CheckingComponentComponent', () => {
  let component: CheckingComponentComponent;
  let fixture: ComponentFixture<CheckingComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CheckingComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckingComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
