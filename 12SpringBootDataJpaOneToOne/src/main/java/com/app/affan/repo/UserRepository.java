package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
