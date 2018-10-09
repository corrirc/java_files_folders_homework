package com.example.codeclan.filesandfoldersservice.Models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;


    private List<Folder> folder;

    public Folder(String name) {
        this.name = name;
        this.folder = new ArrayList<Folder>();
    }

    public Folder() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFiles() {
        return folder;
    }

    public void setFiles(List<File> files) {
        this.folder = folder;
    }
}


