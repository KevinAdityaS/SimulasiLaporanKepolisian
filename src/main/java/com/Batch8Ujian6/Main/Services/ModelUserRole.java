package com.Batch8Ujian6.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian6.Main.Entity.UserRole;
import com.Batch8Ujian6.Main.Repository.UserRoleRepository;

@Service
public class ModelUserRole implements ModelUserRoleInterface{

	@Autowired
	UserRoleRepository userRoleRepository;

	@Override
	public List<UserRole> getAllUserRole() {

		return (List<UserRole>) this.userRoleRepository.findAll();
		
	}

	@Override
	public UserRole getUserRoleByNama(String nama) {

		return this.userRoleRepository.findByNama(nama);
		
	}
	
	@Override
	public UserRole getUserRoleByUsername(String username) {

		return this.userRoleRepository.findByUsername(username);
		
	}

	@Override
	public UserRole addUserRole(UserRole userRole) {

		return this.userRoleRepository.save(userRole);
		
	}

	@Override
	public UserRole getUserRoleById(String id) {

		return (UserRole)this.userRoleRepository.findById(Long.parseLong(id)).get();
		
	}

	@Override
	public void deleteUserRole(String id) {

		this.userRoleRepository.deleteById(Long.parseLong(id));
		
	}
	
}
