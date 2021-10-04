import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup-page',
  templateUrl: './signup-page.component.html',
  styleUrls: ['./signup-page.component.css']
})
export class SignupPageComponent implements OnInit {

  constructor() { }


  public user = {
    email : '',
    username : '',
    mobileNumber : '',
    password : '',
    confirmPasword : '',
  }
  ngOnInit(): void {
  }

  formSubmit()
  {
    alert("yes");
  }
}
