package com.Batch8Ujian6.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian6.Main.Entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long>{

	public Admin findByIdAdmin(Long Id);
	
}
