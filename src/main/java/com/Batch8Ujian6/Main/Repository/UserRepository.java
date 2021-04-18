package com.Batch8Ujian6.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian6.Main.Entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByIdUser(Long Id);
	
}
