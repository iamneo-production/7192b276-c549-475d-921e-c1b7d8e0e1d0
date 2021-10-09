import { Component, OnInit } from '@angular/core';

import {FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  public myForms : FormGroup;

  constructor(fb: FormBuilder) {

    this.myForms = fb.group({
      email : ['', Validators.required],
      password: ['',
        Validators.required]
    });
  }
  ngOnInit(): void {
   
  }
}