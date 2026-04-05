package com.michel.userEmail.repositories;

import com.michel.userEmail.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;

public interface UserRepository extends JpaRepository<UserModel, UID> {
}
