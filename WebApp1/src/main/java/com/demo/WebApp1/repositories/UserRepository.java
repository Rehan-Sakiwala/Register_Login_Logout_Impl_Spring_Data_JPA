package com.demo.WebApp1.repositories;

import com.demo.WebApp1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
