package com.ecole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.dao.AdminRepository;
import com.ecole.dao.UserRepository;
import com.ecole.model.Admin;
import com.ecole.model.User;

@Service
public class UserService {
	
	private UserRepository userRepository;
	private AdminRepository adminRepository;
	
	@Autowired
	public UserService(UserRepository userRepository, AdminRepository adminRepository) {
		
		this.userRepository = userRepository;
		this.adminRepository = adminRepository;
	}

	public Admin getUser(User user) {
		
		User myUser = userRepository.findById(user.getUserName()).get();
		
		if(
				! myUser.equals(null) && 
				myUser.getPass().equals(user.getPass()) && 
				myUser.getRole().equals(user.getRole())
				) {
			
			if(user.getRole().equals("admin")) {
				
				System.out.println("$$$=3=$$$$");
				return adminRepository.findByUser(myUser);
				
			}
			
		}
		
		System.out.println("$$$=4=$$$$");
			
			
		return null;
	}
	
	

}
