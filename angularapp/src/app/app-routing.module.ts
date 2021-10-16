import { SignupPageComponent } from './signup-page/signup-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { CredentialLockerComponent } from './credential-locker/credential-locker.component';
import { AuthGuard } from './_auth/auth.guard';

const routes: Routes = [

  // {path: '', component: LandingComponent},
  {path: '', component: LoginPageComponent},
  // , canActivate:[AuthGuard] , data:{roles:['User']}
  {path: 'home', component: LandingComponent},
  {path: 'credentials', component: CredentialLockerComponent },
  {path: 'signup', component: SignupPageComponent},
  {path: 'login', component: LoginPageComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
