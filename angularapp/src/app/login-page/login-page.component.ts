import { Component, OnInit } from '@angular/core';

import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserAuthService } from '../services/user-auth.service';
import { UserService } from '../services/user.service';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  public myForms: FormGroup;

  constructor(fb: FormBuilder, private userService: UserService, private userAuthService: UserAuthService , private router:Router) {

    this.myForms = fb.group({
      email: ['', Validators.required],
      password: ['',
        Validators.required]
    });
  }
  ngOnInit(): void {

  }



  login(loginForm: NgForm) {
    this.userService.login(loginForm.value).subscribe(
      (response: any) => {

        this.userAuthService.setRoles(response.user.role);
        this.userAuthService.setToken(response.jwtToken);

        const role = response.user.role;
        
        if(role =="User")
        {
          this.router.navigate(['/home']);
        }

      },
      (error) => {
        console.log(error);
      }
    );
  }
}