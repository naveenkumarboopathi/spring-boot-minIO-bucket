package com.develop.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    public ResponseEntity uploadFile(String bucketName, MultipartFile fileName);

    ResponseEntity downloadFile(String bucketName, String fileName);
}
