package com.Batch8Ujian6.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian6.Main.Entity.Admin;
import com.Batch8Ujian6.Main.Repository.AdminRepository;

@Service
public class ModelAdmin implements ModelAdminInterface{

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public List<Admin> getAllAdmin() {
		
		return (List<Admin>) this.adminRepository.findAll();
		
	}

	@Override
	public Admin addAdmin(Admin admin) {

		return this.adminRepository.save(admin);
		
	}

	@Override
	public Admin getAdminById(String id) {

		return ((Admin)this.adminRepository.findByIdAdmin(Long.parseLong(id)));
		
	}

	@Override
	public void deleteAdmin(String id) {

		this.adminRepository.deleteById(Long.parseLong(id));
		
	}

}
