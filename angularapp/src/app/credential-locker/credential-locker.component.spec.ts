import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CredentialLockerComponent } from './credential-locker.component';

describe('CredentialLockerComponent', () => {
  let component: CredentialLockerComponent;
  let fixture: ComponentFixture<CredentialLockerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CredentialLockerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CredentialLockerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
