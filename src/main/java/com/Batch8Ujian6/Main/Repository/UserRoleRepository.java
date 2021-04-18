package com.Batch8Ujian6.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian6.Main.Entity.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long>{

	public UserRole findByIdRole(Long id);
	public UserRole findByNama(String nama);
	public UserRole findByUsername(String username);
	
}
