import { Component, OnInit } from '@angular/core';
import { FormBuilder, NgForm, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../services/user.service';
import { PasswordStrengthValidator } from './password-strength.validators';

@Component({
  selector: 'app-credential-locker',
  templateUrl: './credential-locker.component.html',
  styleUrls: ['./credential-locker.component.css']
})
export class CredentialLockerComponent implements OnInit {

  credData = null;
  public myForms: FormGroup;
  public updateform: FormGroup;

  constructor(fb: FormBuilder, private userService: UserService) {

    this.getCredData();
    // this.myForms = fb.group({

    //   passcode : [null, Validators.required],

    // });

    // this.updateform = fb.group({
    //   sourceName : ['', Validators.required],
    //   userName : ['', Validators.required],
    //   password: [null, Validators.compose([
    //     Validators.required, Validators.minLength(8), PasswordStrengthValidator])]
    // });
  }
  ngOnInit(): void {
  }

  formSubmit(credentialDetails: NgForm) {
    this.userService.addCred(credentialDetails.value).subscribe(
      (data) => {
        console.log(data);
        credentialDetails.reset();
        this.getCredData();
      },
      (error) => {
        console.log(error);
        alert("error");
      }

    )
  }

  getCredData() {
    this.userService.getCred().subscribe(
      (data) => {
        console.log(data);
        this.credData = data;
      },
      (error) => {
        console.log(error);
      }
    )
  }

  deleteCredData(credData) {
    this.userService.deleteCred(credData.valutId).subscribe(
      (data) => {
        console.log(data);
        this.getCredData();
      },
      (error) => {
        console.log(error);
      }
    )
  }

}
