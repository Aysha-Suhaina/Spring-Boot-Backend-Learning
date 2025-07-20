package com.example.product_app;

import com.example.product_app.model.FileEntity;
import com.example.product_app.service.FileStorageService;

// import java.net.http.HttpHeaders;

import org.springframework.http.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileStorageService fileStorageService;

    public FileController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        System.out.println(" file controller method is trying to execute !!!! ");
        String message = fileStorageService.storeFile(file);
        return ResponseEntity.ok(message);
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable Long id){
        FileEntity fileEntity=fileStorageService.getFile(id);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,"attachment: filename=\"") .contentType(MediaType.parseMediaType(fileEntity.getFileType())).body(fileEntity.getData());
    
    }
}



