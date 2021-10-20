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
import { HttpClientModule } from '@angular/common/http';
import { MediaLockerComponent } from './media-locker/media-locker.component';
import { FormsModule , ReactiveFormsModule } from '@angular/forms';
import { HTTP_INTERCEPTORS } from '@angular/common/http'
import { RouterModule } from '@angular/router';
import { AuthGuard } from './_auth/auth.guard';
// import { AuthInterceptor } from './_auth/auth.interceptor';
import { UserService } from './services/user.service';
import { BankLockerComponent } from './bank-locker/bank-locker.component';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CredentialLockerComponent,
    LandingComponent,
    LoginPageComponent,
    SignupPageComponent,
    MediaLockerComponent,
    AdminPageComponent,
    BankLockerComponent
  ],
  
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule ,
    RouterModule,
    FormsModule,
  ],

  providers: [
    AuthGuard ,  
    // {
    //   // provide:HTTP_INTERCEPTORS,
    //   // useClass:AuthInterceptor,
    //   // multi:true
    // },
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
