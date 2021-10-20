import { Injectable } from '@angular/core';
import { HttpClient, HttpEvent, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FileUploadService {

  constructor(private http:HttpClient) { }
  PATH_OF_API = "https://8080-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io";

  uploadFiles(file: File): Observable<HttpEvent<any>> {
    const formData: FormData = new FormData();

    formData.append('file', file);

    const req = new HttpRequest('POST',this.PATH_OF_API +" /upload", formData, {
      reportProgress: true,
      responseType: 'json'
    });

    return this.http.request(req);
  }

  

}
