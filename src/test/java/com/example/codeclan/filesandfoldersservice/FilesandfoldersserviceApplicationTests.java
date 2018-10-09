package com.example.codeclan.filesandfoldersservice;

import com.example.codeclan.filesandfoldersservice.Models.Folder;
import com.example.codeclan.filesandfoldersservice.Repositorys.FileRepository;
import com.example.codeclan.filesandfoldersservice.Repositorys.FolderRepository;
import com.example.codeclan.filesandfoldersservice.Repositorys.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersserviceApplicationTests {


	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderThenSave() {

		Folder folder1 = new Folder("folder");
		folderRepository.save(folder1);

	}

	@Test
	public void createUserAndFileThenSave() {
	}
}
