package com.example.product_app.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.product_app.model.FileEntity;

public interface FileStorageService {
    String storeFile(MultipartFile file);
    FileEntity getFile(Long id);
}
