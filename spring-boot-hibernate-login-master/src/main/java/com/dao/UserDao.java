package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    User findByEmail(String email);
}
