package com.example.codeclan.filesandfoldersservice.Controllers;

import com.example.codeclan.filesandfoldersservice.Repositorys.FileRepository;
import com.example.codeclan.filesandfoldersservice.Repositorys.FolderRepository;
import com.example.codeclan.filesandfoldersservice.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

}
