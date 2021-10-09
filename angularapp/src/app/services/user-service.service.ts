import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor( private http : HttpClient) { 
   
  }


  // adding user 

  public addUser(user : any)
  {
    // this /user should be same as in userController mapping;
    return this.http.post(`${baseUrl}/signup/`,user)
    // return this.http.post("https://8080-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io/signup" , user)
  }

  // constructor( private http : HttpClient ){}

  // public loginUserfromRemote(user :User ) :Observable<any>{
  //   return   this.http.post<any>("https://8080-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io/signup" , user)

  // }
}
