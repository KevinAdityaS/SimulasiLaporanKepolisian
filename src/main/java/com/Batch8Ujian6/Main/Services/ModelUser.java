package com.Batch8Ujian6.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian6.Main.Entity.User;
import com.Batch8Ujian6.Main.Repository.UserRepository;

@Service
public class ModelUser implements ModelUserInterface{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {

		return (List<User>) this.userRepository.findAll();
		
	}

	@Override
	public User addUser(User user) {

		return this.userRepository.save(user);
		
	}

	@Override
	public User getUserById(String id) {

		return ((User)this.userRepository.findByIdUser(Long.parseLong(id)));
		
	}

	@Override
	public void deleteUser(String id) {

		this.userRepository.deleteById(Long.parseLong(id));
		
	}

}
