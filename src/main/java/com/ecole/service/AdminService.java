package com.ecole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.dao.AdminRepository;
import com.ecole.model.Admin;

@Service
public class AdminService {
	
	private AdminRepository adminRepository;
	
	@Autowired
	public AdminService(AdminRepository adminRepository) {
		
		this.adminRepository = adminRepository;
	}

	public void postAdmin(Admin admin) {
		
		adminRepository.save(admin);
	}
	
	

}
