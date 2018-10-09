package com.example.codeclan.filesandfoldersservice.Models;


import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_extension")
    private String fileExtension;

    @Column(name = "file_size")
    private int fileSize;

    @Column(name = "file_folder")
    private String fileFolder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public File(String fileName, String fileExtension, int fileSize, String fileFolder) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.fileFolder = fileFolder;
    }


    public File() {
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFolder() {
        return fileFolder;
    }

    public void setFileFolder(String fileFolder) {
        this.fileFolder = fileFolder;
    }
}


