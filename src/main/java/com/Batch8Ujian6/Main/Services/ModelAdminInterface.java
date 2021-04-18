package com.Batch8Ujian6.Main.Services;

import java.util.List;

import com.Batch8Ujian6.Main.Entity.Admin;

public interface ModelAdminInterface {

	public List<Admin> getAllAdmin();
		
	public Admin addAdmin(Admin admin);
	
	public Admin getAdminById(String id);
	
	public void deleteAdmin(String id);
	
}
