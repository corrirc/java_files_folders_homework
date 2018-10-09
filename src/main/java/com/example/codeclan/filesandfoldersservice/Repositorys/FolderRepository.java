package com.example.codeclan.filesandfoldersservice.Repositorys;


import com.example.codeclan.filesandfoldersservice.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}