package com.example.codeclan.filesandfoldersservice.Repositorys;

import com.example.codeclan.filesandfoldersservice.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
