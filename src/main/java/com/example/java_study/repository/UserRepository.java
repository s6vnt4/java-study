package com.example.java_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java_study.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
