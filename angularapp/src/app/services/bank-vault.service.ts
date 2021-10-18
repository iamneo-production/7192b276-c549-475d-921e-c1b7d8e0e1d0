import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BankVaultService {
  PATH_OF_API = "https://8080-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io";

  constructor(private http: HttpClient) {

  }


  public addBank(bank: any){
    return this.http.post(this.PATH_OF_API + "/bank", bank)
  }

  public updateBank(bank: any){
    return this.http.put(this.PATH_OF_API + "/bank/", bank/*, { params: {id: bank.vaultId}}*/)
  }

  public deleteBank(bankId: any){
    return this.http.put(this.PATH_OF_API + "/bank/", {}, { params: {id: bankId}})
  }
}
