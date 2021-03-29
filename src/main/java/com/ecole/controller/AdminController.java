package com.ecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.model.Admin;
import com.ecole.service.AdminService;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	private AdminService adminService;
	
	@Autowired
	public AdminController(AdminService adminService) {
		
		this.adminService = adminService;
	}
	
	@PostMapping
	public void postAdmin(@RequestBody Admin admin) {
		
		adminService.postAdmin(admin);
	}

}
