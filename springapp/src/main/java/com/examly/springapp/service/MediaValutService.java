package com.examly.springapp.service;
import com.examly.springapp.dao.MediaDao;
import com.examly.springapp.entity.MediaValutModel;
import com.examly.springapp.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service
public class MediaValutService {

@Autowired
private MediaDao mediaDao;

    final String UPLOAD_DIR = "C:\\Users\\HImanshu\\Downloads\\springapp\\src\\main\\resources\\files";

    public boolean uploadFile(MultipartFile  multipartFile) throws Exception
    {
        boolean f = false;

        try{

            Files.copy(multipartFile.getInputStream() , Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()) , StandardCopyOption.REPLACE_EXISTING);

            f = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }

    public String mediaInfoEditSave(Long id ,MediaValutModel userModel) {
        try{
           MediaValutModel media= mediaDao.getOne(id);

            media.setMediaName(media.getMediaName());

            return "Information Updated";
        }
        catch (Exception e){
            System.out.println("\n\nError while updating bank : " +e+ "\n\n");
            return "False";
        }
    }


    public List<MediaValutModel> getMediaInfo() {
        return (List<MediaValutModel>) mediaDao.findAll();
    }


//    public MediaValutModel mediaInfoById(String email) {
//        return mediaDao.findById(email).get();
//    }


    public void mediaInfoDelete(Long id) {
        mediaDao.deleteById(id);
    }


    public String mediaInfoSave(MediaValutModel media) {

        try{
            mediaDao.save(media);
            return "Information Added Successfully";
        }
        catch (Exception e) {
            System.out.println("\n\nError while adding bank : " + e + "\n\n");
            return "false";
        }
    }
}
