import { FormGroup, FormBuilder } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bank-locker',
  templateUrl: './bank-locker.component.html',
  styleUrls: ['./bank-locker.component.css']
})
export class BankLockerComponent implements OnInit {

  mode: string;
  public bankForm: FormGroup;
  public bank = {
    accountNumber: '',
    accountName: '',
    username: '',
    password: '',
    ifsc: ''

  }
  constructor(bf: FormBuilder) {
    this.bankForm = bf.group({

    })
  }

  ngOnInit(): void {
  }

  bankSubmit(){
    console.log(this.bank)
    alert("")
  }

  modeNew(){
    this.mode = "NEW"
  }

  modeUpdate(){
    this.mode = "UPDATE"
  }

}
