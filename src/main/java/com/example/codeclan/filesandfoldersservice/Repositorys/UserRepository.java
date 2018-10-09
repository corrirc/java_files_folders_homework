package com.example.codeclan.filesandfoldersservice.Repositorys;

import com.example.codeclan.filesandfoldersservice.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
