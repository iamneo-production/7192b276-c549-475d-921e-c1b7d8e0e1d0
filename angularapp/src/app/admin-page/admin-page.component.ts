import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, NgForm, Validators } from '@angular/forms';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent  {


  userDetails = null
  constructor(private userService : UserService) { 
    this.getUser();
  }
  PATH_OF_API = "localhost:9090";
  ngOnInit(): void {
  }
  
  details(){
    alert("Flex-Box");
  }

  fillAdminForm(editForm : NgForm){
    this.userService.fillAdminForm(editForm.value).subscribe(
      (resp)=>
      {
        console.log(resp);
        // fillAdminForm.reset();
        this.getUser();
      },
      (error) =>
      {
        console.log(error);
      }
    )
  }

 getUser(){
   this.userService.getUsers().subscribe(
     (resp) =>{
       console.log(resp);
       this.userDetails = resp;
     },
     (error) =>{
      console.log(error);
    }
   )
 }
}
