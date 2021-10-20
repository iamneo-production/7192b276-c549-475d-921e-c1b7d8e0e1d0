import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MediaLockerComponent } from './media-locker.component';

describe('MediaLockerComponent', () => {
  let component: MediaLockerComponent;
  let fixture: ComponentFixture<MediaLockerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MediaLockerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MediaLockerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
