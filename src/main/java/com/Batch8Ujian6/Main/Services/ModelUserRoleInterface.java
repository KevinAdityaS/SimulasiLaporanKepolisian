package com.Batch8Ujian6.Main.Services;

import java.util.List;

import com.Batch8Ujian6.Main.Entity.UserRole;

public interface ModelUserRoleInterface {

	public List<UserRole> getAllUserRole();
	
	public UserRole getUserRoleByNama(String nama);
	
	public UserRole getUserRoleByUsername(String username);
	
	public UserRole addUserRole(UserRole userRole);
	
	public UserRole getUserRoleById(String id);
	
	public void deleteUserRole(String id);
	
}
