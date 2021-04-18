package com.Batch8Ujian6.Main.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.Batch8Ujian6.Main.Entity.UserRole;
import com.Batch8Ujian6.Main.Repository.UserRoleRepository;

public class CustomUserDetailServices implements UserDetailsService{

	@Autowired 
	UserRoleRepository userRoleRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		UserRole user = userRoleRepository.findByUsername(username);
		
		if(user == null) {
			
			throw new UsernameNotFoundException("User not found!");
			
		}
		
		return new CustomUserDetail(user);
		
	}
	
}
