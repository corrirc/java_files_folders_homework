package com.example.codeclan.filesandfoldersservice.Components;

import com.example.codeclan.filesandfoldersservice.Repositorys.FileRepository;
import com.example.codeclan.filesandfoldersservice.Repositorys.FolderRepository;
import com.example.codeclan.filesandfoldersservice.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    UserRepository userRepository;


    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run (ApplicationArguments args) {

    }

}
