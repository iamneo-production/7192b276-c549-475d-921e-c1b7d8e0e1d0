import { BankVaultService } from './../services/bank-vault.service';
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
  constructor(bf: FormBuilder, private bankService: BankVaultService) {
    this.bankForm = bf.group({

    })
  }

  ngOnInit(): void {
  }

  bankSubmit(){
    console.log(this.bank)
    alert("")

    switch (this.mode) {
      case "NEW":
        this.bankService.addBank(this.bank).subscribe(
          (data)=> {
            console.log(data)
            alert("success")
          },
          (error) => {
            console.log(error)
            alert("something went wrong")
          }
        )
        break;
      case "UPDATE":
        this.bankService.updateBank(this.bank).subscribe(
          (data)=> {
            console.log(data)
            alert("success")
          },
          (error) => {
            console.log(error)
            alert("something went wrong")
          }
        )
        break;
      default:
        break;
    }

  }

  modeNew(){
    this.mode = "NEW"
    document.getElementById("bankLockerForm").submit()
  }

  modeUpdate(){
    this.mode = "UPDATE"
    document.getElementById("bankLockerForm").submit()
  }

}
