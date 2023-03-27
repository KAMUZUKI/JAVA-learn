package com.mu.demo.controller;

import com.mu.demo.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : MUZUKI
 * @date : 2023-03-22 15:17
 * 文件上传控制器
 **/

@RestController
@RequestMapping("upload")
@Slf4j
public class UploadController {

    @Autowired
    private UploadService uploadService;

    /**
     * 上传图片
     * @param file
     */
    @PostMapping("image")
    public ResponseEntity<String> uploadImage(@RequestParam("file")MultipartFile file){

        String url=uploadService.uploadImage(file);
        log.info("返回地址：【{}】",url);
        return ResponseEntity.ok(url);
    }


}