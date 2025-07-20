package com.example.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product_app.model.FileEntity;

public interface FileInfoRepository extends JpaRepository<FileEntity, Long> {
}

