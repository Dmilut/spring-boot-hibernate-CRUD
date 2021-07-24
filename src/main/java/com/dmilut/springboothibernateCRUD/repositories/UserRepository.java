package com.dmilut.springboothibernateCRUD.repositories;

import com.dmilut.springboothibernateCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Query method
    Optional<User> findByEmail(String email);
}

