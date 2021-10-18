import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../services/user.service';


import { PasswordStrengthValidator } from './password-strength.validators';

@Component({
  selector: 'app-signup-page',
  templateUrl: './signup-page.component.html',
  styleUrls: ['./signup-page.component.css']
})
export class SignupPageComponent implements OnInit {



  public myForms: FormGroup;

  constructor( fb: FormBuilder ,private userService : UserService) {
    
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
  ngOnInit(): void {}

  public formData = {
    email: '',
    password :'',
    mobileNumber:'',
    username: '',

  };

  formSubmit(){
    this.userService.addUser(this.formData).subscribe(
      (data) =>{
        console.log(data);
        alert("success");
      },
      (error)=>
      {
        console.log(error);
        alert("error");
      }
      
      )
  }

  
  // user = new User();
  // formSubmit()
  // {
  //   this.userService.loginUserfromRemote(this.user).subscribe
  //   (
      
  //     (data) =>{
  //       console.log(data);
  //       alert("success");
  //     },
  //     (error)=>
  //     {
  //       console.log(error);
  //       alert("error");
  //     }
      
  //   )
  // }
   
}
