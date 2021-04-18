package com.Batch8Ujian6.Main.Services;

import java.util.List;

import com.Batch8Ujian6.Main.Entity.User;

public interface ModelUserInterface {

	public List<User> getAllUser();
		
	public User addUser(User user);
	
	public User getUserById(String id);
	
	public void deleteUser(String id);
	
}
