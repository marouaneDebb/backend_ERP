package com.example.school.services;

import com.example.school.Entities.Parent;
import com.example.school.Repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Service
public class ParentService {
    @Autowired
    public ParentRepository parentRepository;
     public static String uploadDirectory = System.getProperty("user.dir")+"/src/main/webapp/images";
    public Parent saveParent(MultipartFile file, Parent parent) throws IOException {
        parent.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        return parentRepository.save(parent);
    }

}
