import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CredentialLockerComponent } from './credential-locker/credential-locker.component';
import { CheckingComponentComponent } from './checking-component/checking-component.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CredentialLockerComponent,
    CheckingComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
