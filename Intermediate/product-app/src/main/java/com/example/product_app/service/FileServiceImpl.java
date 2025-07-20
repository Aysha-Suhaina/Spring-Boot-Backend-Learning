package com.example.product_app.service;

import java.io.IOException;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.product_app.model.FileEntity;
import com.example.product_app.repository.FileInfoRepository;

@Service
public class FileServiceImpl implements FileStorageService {

    private final FileInfoRepository fileInfoRepository;

    public FileServiceImpl(FileInfoRepository fileInfoRepository) {
        this.fileInfoRepository = fileInfoRepository;
    }

    @Override
    public String storeFile(MultipartFile file) {
        try {
            FileEntity fileEntity = new FileEntity();
            fileEntity.setFileName(file.getOriginalFilename());
            fileEntity.setFileType(file.getContentType());
            fileEntity.setData(file.getBytes());

            fileInfoRepository.save(fileEntity);
            return fileEntity.getFileName();
        } catch (IOException e) {
            throw new RuntimeException("Failed to store file: " + e.getMessage());
        }
    }

    @Override
    public FileEntity getFile(Long id){
        return fileInfoRepository.findById(id).orElseThrow(()-> new RuntimeException("File not found with id : " 
        + id));
    }
}
