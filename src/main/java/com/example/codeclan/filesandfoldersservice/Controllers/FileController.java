package com.example.codeclan.filesandfoldersservice.Controllers;


import com.example.codeclan.filesandfoldersservice.Repositorys.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/files")
public class FileController {

    @Autowired
    FileRepository fileRepository;

}
