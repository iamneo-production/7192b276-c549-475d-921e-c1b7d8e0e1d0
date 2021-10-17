import { AuthGuard } from './_auth/auth.guard';
import { UserService } from './services/user.service';
import { BankVaultService } from './services/bank-vault.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AdminPageComponent } from './admin-page/admin-page.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CredentialLockerComponent } from './credential-locker/credential-locker.component';
import { LandingComponent } from './landing/landing.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { SignupPageComponent } from './signup-page/signup-page.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http'
import { MediaLockerComponent } from './media-locker/media-locker.component';
import { RouterModule } from '@angular/router';
import {   FormsModule , ReactiveFormsModule } from '@angular/forms';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CredentialLockerComponent,
    LandingComponent,
    LoginPageComponent,
    SignupPageComponent,
    MediaLockerComponent,
    AdminPageComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule ,
    RouterModule,
    HttpClientModule,
  ],

  providers: [
    AuthGuard ,
    {
      provide:HTTP_INTERCEPTORS,
      useClass:AuthenticatorResponse,
      multi:true
    },
    UserService,
    BankVaultService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
