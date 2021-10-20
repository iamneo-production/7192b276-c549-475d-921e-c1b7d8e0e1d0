import { HttpClient, HttpHandler, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserAuthService } from './user-auth.service';


@Injectable({
  providedIn: 'root'
})
export class UserService {

   PATH_OF_API = "https://8080-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io";
  // PATH_OF_API = "http://localhost:9090";

  requestHEADER = new HttpHeaders(
    {
      "No-Auth": "True"
    }
  )
  constructor(
    private http: HttpClient,
    private userAuthService: UserAuthService
  ) { }


  public addUser(user: any) {
    return this.http.post(this.PATH_OF_API + "/signup", user);
  }

  public login(loginData) {
    return this.http.post(this.PATH_OF_API + "/authenticate", loginData, { headers: this.requestHEADER });
  }

  public roleMatch(allowedRoles): boolean {
    let isMatch = false;
    const userRoles: any = this.userAuthService.getRoles();
    // console.log(allowedRoles);
    // console.log(userRoles);
    if (userRoles != null && userRoles) {
      // for (let i = 0; i < userRoles.length; i++) {
      //   for (let j = 0; j < allowedRoles.length; j++) {
          if (userRoles.roleName == allowedRoles) {
            console.log(userRoles);
            console.log("yes");
            isMatch = true;
            return isMatch;
          } else {
            return isMatch;
          }
      //   }
      // }
    }
  }



  fillAdminForm(user: any){
    return this.http.put(this.PATH_OF_API + "/update-admin", user);
  }
  public getUsers(){
    return this.http.get(this.PATH_OF_API+'/admin/user' );
  }

  public deleteUser(id){
    return this.http.delete(this.PATH_OF_API + "/admin/delete/id=" + id);
  }


  // ------------------------------------BANK DETAILS -----------------------------------------------------
  public addBank(bank: any) {
    return this.http.post(this.PATH_OF_API + "/bank/id=", bank);
  }

  public getBank() {
    return this.http.get(this.PATH_OF_API + "/bank");
  }
  public deleteBank(id){
    return this.http.delete(this.PATH_OF_API + "/bank/id=" + id);
  }
  

  //-------------------------------------CRED DETAILS -------------------------------------------------------
  public addCred(credential: any) {
    return this.http.post(this.PATH_OF_API + "/credentials/id=", credential);
  }

  public getCred() {
    return this.http.get(this.PATH_OF_API + "/credentials");
  }

  public deleteCred(id){
    return this.http.delete(this.PATH_OF_API + "/credentials/id=" + id);
  }
  
   //-------------------------------------Media DETAILS -------------------------------------------------------
   public addMedia(media: any) {
    return this.http.post(this.PATH_OF_API + "/media/id=", media);
  }

  public getMedia() {
    return this.http.get(this.PATH_OF_API + "/media");
  }

  public deleteMedia(id){
    return this.http.delete(this.PATH_OF_API + "/media/id=" + id);
  }
  
}
