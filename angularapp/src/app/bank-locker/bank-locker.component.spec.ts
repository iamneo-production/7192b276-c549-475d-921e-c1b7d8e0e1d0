import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BankLockerComponent } from './bank-locker.component';

describe('BankLockerComponent', () => {
  let component: BankLockerComponent;
  let fixture: ComponentFixture<BankLockerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BankLockerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BankLockerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
