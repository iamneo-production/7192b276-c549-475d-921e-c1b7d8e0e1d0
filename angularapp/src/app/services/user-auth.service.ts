import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserAuthService {

  constructor() { }

  
//----------------------------- TO STORE USER ROLE ---------------------------------------------------------
 
  public setRoles(roles: []) {
    localStorage.setItem('roles', JSON.stringify(roles));
  }

  public getRoles(): [] {
    return JSON.parse(localStorage.getItem('roles'));
  }

  //----------------------------- TO STORE GENERATED TOKEN ---------------------------------------------------------
  public setToken(jwtToken: string) {
    localStorage.setItem("jwtToken", jwtToken);
  }

  public getToken(): string {
    return localStorage.getItem("jwtToken");
  }
//----------------------------- TO CLEAR LOCALSTORAGE AND CHECK LOGIN / LOGOUT ---------------------------------------------------------
 
public clear(){
  localStorage.clear();
}
public isLoggedIn(){
  return this.getRoles() && this.getToken();
}

}
