import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-bank-locker',
  templateUrl: './bank-locker.component.html',
  styleUrls: ['./bank-locker.component.css']
})
export class BankLockerComponent implements OnInit {

  bankData = null;
  constructor(private userService : UserService) {
    this.getBankData();
   }

  ngOnInit(): void {
  }
  // public bankData = {
  //  accName: '',
  //  accNumber:'',
  //   accPassword :'',
  //   accIFSCCode:'',
  //   accUsername: '',

  // };

  formSubmit(bankDetails : NgForm){
    this.userService.addBank(bankDetails.value).subscribe(
      (data) =>{
        console.log(data);
        bankDetails.reset();
        this.getBankData();
      },
      (error)=>
      {
        console.log(error);
        alert("error");
      }
      
      )
  }

  getBankData(){
    this.userService.getBank().subscribe(
      (data) =>{
        console.log(data);
        this.bankData = data;
      },
      (error)=>
      {
        console.log(error);

      }
      
      )
  }

  deleteBankData(bankData) {
    this.userService.deleteMedia(bankData.accountname).subscribe(
      (data) => {
        console.log(data);
        this.getBankData();
      },
      (error) => {
        console.log(error);
      }
    )
  }
}
