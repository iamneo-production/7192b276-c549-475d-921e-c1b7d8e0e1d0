import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CredentialLockerComponent } from './credential-locker/credential-locker.component';
import { LandingComponent } from './landing/landing.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { SignupPageComponent } from './signup-page/signup-page.component';
import { HttpClientModule } from '@angular/common/http'

import {   FormsModule , ReactiveFormsModule } from '@angular/forms';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CredentialLockerComponent,
    LandingComponent,
    LoginPageComponent,
    SignupPageComponent,
    
  ],
  
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule 
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
