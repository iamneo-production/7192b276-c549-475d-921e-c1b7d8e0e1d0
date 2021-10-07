import { SignupPageComponent } from './signup-page/signup-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { CredentialLockerComponent } from './credential-locker/credential-locker.component';
import { BankLockerComponent } from './bank-locker/bank-locker.component';

const routes: Routes = [

  {path: '', component: LandingComponent},
  {path: 'home', component: LandingComponent},
  {path: 'credentials', component: CredentialLockerComponent},
  {path: 'login', component: LoginPageComponent},
  {path: 'signup', component: SignupPageComponent},
  {path: 'bank', component:BankLockerComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
