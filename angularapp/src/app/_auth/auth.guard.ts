import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { UserAuthService } from '../services/user-auth.service';
import { UserService } from '../services/user.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private userAuthService : UserAuthService ,private userService: UserService, private router : Router){}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

      if(this.userAuthService.getToken() !== null)
      {
        const role = route.data["role"] as string;     
        if(role){
          const match = this.userService.roleMatch(role);

          console.log(role == "Admin");
          if(role){
            this.router.navigate(['/admin']);
            return true;
          }
          else{
            this.router.navigate(['/login']);
            return false;
          }
        }
      }
      this.router.navigate(['/login']);
      return false;
  }
}
