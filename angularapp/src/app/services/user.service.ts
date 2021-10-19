import { HttpClient, HttpHandler, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserAuthService } from './user-auth.service';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  PATH_OF_API = "https://8080-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io";

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

    if (userRoles != null && userRoles) {
      for (let i = 0; i < userRoles.length; i++) {
        for (let j = 0; j < allowedRoles.length; j++) {
          if (userRoles[i].roleName === allowedRoles[j]) {
            isMatch = true;
            return isMatch;
          } else {
            return isMatch;
          }
        }
      }
    }
  }
}
