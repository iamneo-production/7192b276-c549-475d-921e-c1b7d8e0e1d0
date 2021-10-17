import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PasswordStrengthValidator } from './password-strength.validators';

@Component({
  selector: 'app-media-locker',
  templateUrl: './media-locker.component.html',
  styleUrls: ['./media-locker.component.css']
})
export class MediaLockerComponent implements OnInit {

  public myForms: FormGroup;
  public updateform: FormGroup;

  constructor(fb: FormBuilder) {

    this.myForms = fb.group({
     
      passcode : [null, Validators.required],
      
    });

    this.updateform = fb.group({
      sourceName : ['', Validators.required],
      userName : ['', Validators.required],
      password: [null, Validators.compose([
        Validators.required, Validators.minLength(8), PasswordStrengthValidator])]
    });
  }
  ngOnInit(): void {
  }

}
