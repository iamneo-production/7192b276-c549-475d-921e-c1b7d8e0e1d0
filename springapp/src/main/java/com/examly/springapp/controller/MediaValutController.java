package com.examly.springapp.controller;

import com.examly.springapp.service.MediaValutService;
import org.springframework.beans.factory.annotation.Autowired;
import com.examly.springapp.entity.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MediaValutController {

    @Autowired
    private MediaValutService mediaValutService;

    List<String> fileNames = new ArrayList<String>();

//    @PostMapping("/media/{id}")
//    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file) {
//
//
//        try{
//
//           boolean c =  mediaValutService.uploadFile(file);
//           if(c)
//           {
//               return ResponseEntity.ok("file uploaded successfully");
//           }
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return ResponseEntity.ok("working");
//    }

    @GetMapping("/media")
    public List<MediaValutModel> getMediaInfo(){
        return mediaValutService.getMediaInfo();
    }
//    @GetMapping("/getone/{userId}")
//    public MediaValutModel mediaInfoById(@PathVariable(name = "userId") String media) {
//        return mediaValutService.mediaInfoById(media);
//    }

    @PostMapping("/media/{id}")
    public String mediaInfoSave( @RequestBody MediaValutModel media){
        return mediaValutService.mediaInfoSave(media);
    }

    @DeleteMapping("/media/{id}")
    public void mediaInfoDelete(@PathVariable Long id){
         mediaValutService.mediaInfoDelete(id);
    }

    @PutMapping("/media/{id}")
    public String mediaInfoEditSave(@PathVariable Long id, @RequestBody MediaValutModel media){
        return mediaValutService.mediaInfoEditSave(id, media);
    }



}
