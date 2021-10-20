import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { FileUploadService } from '../services/file-upload.service';
import { PasswordStrengthValidator } from './password-strength.validators';
import { HttpResponse, HttpEventType } from '@angular/common/http';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-media-locker',
  templateUrl: './media-locker.component.html',
  styleUrls: ['./media-locker.component.css']
})
export class MediaLockerComponent implements OnInit {
  
  mediaData = null;
  selectedFiles: FileList;
  currentFile: File;

  progress: { percentage: number } = { percentage: 0 };


  public myForms: FormGroup;
  public updateform: FormGroup;

  constructor(fb: FormBuilder ,private userService:UserService, private fileUploadService : FileUploadService) {

    this.getMedia();
    this.myForms = fb.group({
     
      passcode : [null, Validators.required],
      
    });

    this.updateform = fb.group({
      sourceName : ['', Validators.required],
      userName : ['', Validators.required],
      password: [null, Validators.compose([
        Validators.required, Validators.minLength(8), PasswordStrengthValidator])]
    });
  }
  ngOnInit(): void {
  }


  selectFile(event) {
    this.selectedFiles = event.target.files;
  }

  uploadFile() {
    this.progress.percentage = 0;
    this.currentFile = this.selectedFiles.item(0);
    this.fileUploadService.uploadFiles(this.currentFile).subscribe(event => {
      if (event.type === HttpEventType.UploadProgress) {
        this.progress.percentage = Math.round(
          (100 * event.loaded) / event.total
        );
      } else if (event instanceof HttpResponse) {
        console.log('File uploaded successfully');
      }
    });
    this.selectedFiles = undefined;
  }

  formSubmit(mediaDetails : NgForm){
    this.userService.addBank(mediaDetails.value).subscribe(
      (data) =>{
        console.log(data);
        mediaDetails.reset();
        this.getMedia();
      },
      (error)=>
      {
        console.log(error);
        alert("error");
      }
      
      )
  }

  getMedia() {
    this.userService.getMedia().subscribe(
      (data) => {
        console.log(data);
        this.mediaData = data;
      },
      (error) => {
        console.log(error);
      }
    )
  }

  deleteMedia(credData) {
    this.userService.deleteMedia(credData.valutId).subscribe(
      (data) => {
        console.log(data);
        this.getMedia();
      },
      (error) => {
        console.log(error);
      }
    )
  }
}

