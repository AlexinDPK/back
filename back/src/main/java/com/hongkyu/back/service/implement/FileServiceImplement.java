package com.hongkyu.back.service.implement;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hongkyu.back.service.FileService;

@Service
public class FileServiceImplement implements FileService {

@Override
public String upload(MultipartFile file) {

if (file.isEmpty()) return null;

String 

}

    @Override
    public Resource getImage(String fileName) {

    }

}
