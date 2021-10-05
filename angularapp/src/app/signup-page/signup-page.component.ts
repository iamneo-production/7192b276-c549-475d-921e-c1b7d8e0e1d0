import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PasswordStrengthValidator } from './password-strength.validators';

@Component({
  selector: 'app-signup-page',
  templateUrl: './signup-page.component.html',
  styleUrls: ['./signup-page.component.css']
})
export class SignupPageComponent implements OnInit {



  public myForms: FormGroup;

  constructor(fb: FormBuilder) {

    this.myForms = fb.group({
      email : ['', Validators.required],
      userName : ['', Validators.required],
      mobile : ['', Validators.required],
      password: [null, Validators.compose([
        Validators.required, Validators.minLength(8), PasswordStrengthValidator])]
    });
  }


  get email()
  {
    return this.myForms.get('email')
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
}
