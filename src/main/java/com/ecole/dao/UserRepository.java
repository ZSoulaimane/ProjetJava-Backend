package com.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
