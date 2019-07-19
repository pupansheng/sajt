package com.pps.suanjiaotyong.controller;

import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname uploadController
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/17 15:15
 * @Vestion 1.0
 **/
@RestController
public class uploadController {

    @Value("${imagePath}")
    String imagePath;
    @Autowired
    IdWorker idWorker;

    @RequestMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {

        if(file==null){


            return  new Result("no",false);

        }

        MyLog.logger.info("文件上传："+file.getOriginalFilename());
        Result result=new Result();

        //1、取文件的扩展名
        try {
            String originalFilename = file.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

            //创建一个文件名
            String newName = idWorker.nextId() + "." + extName;

            //创建目录
            String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
            if (!Files.exists(Paths.get(imagePath + "//" + currentDate))) {
                Files.createDirectories(Paths.get(imagePath + "//" + currentDate));
            }
            Files.write(Paths.get(imagePath + "//" + currentDate + "//" + newName), file.getBytes());

            String url="uploadImages//"+currentDate + "//" + newName;
            result.setStatus(true);
            result.setData(url);

        }
        catch ( Exception e){

            result.setStatus(false);
            result.setMessage(e.getMessage());

        }

      return  result;


    }



}
