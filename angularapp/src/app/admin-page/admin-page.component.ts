import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent  {

  constructor() { }

  ngOnInit(): void {
  }
  
  details(){
    alert("Flex-Box");
  }
}
