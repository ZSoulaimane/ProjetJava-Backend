package com.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.model.Admin;
import com.ecole.model.User;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByUser(User user);
}
