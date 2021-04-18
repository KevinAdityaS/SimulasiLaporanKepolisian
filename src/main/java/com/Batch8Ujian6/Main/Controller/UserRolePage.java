package com.Batch8Ujian6.Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Batch8Ujian6.Main.Entity.UserRole;
import com.Batch8Ujian6.Main.Services.ModelUserRole;

@Controller
public class UserRolePage {

	@Autowired
	ModelUserRole modelUserRole;
	
	@GetMapping("/userrole/view")
	public String viewIndexUserRole (Model model) {
		
		model.addAttribute("listUserRole", modelUserRole.getAllUserRole());
		model.addAttribute("active", 6);
		
		return "view_userrole";
		
	}
	
	@GetMapping("/userrole/admin/add")
	public String viewAddUserRoleAdmin(Model model) {
		
		model.addAttribute("userRole", new UserRole());
		model.addAttribute("active", 5);
		
		return "add_userrole_admin";
		
	}

	@GetMapping("/userrole/user/add")
	public String viewAddUserRoleUser(Model model) {
		
		model.addAttribute("userRole", new UserRole());
		model.addAttribute("active", 4);
		
		return "add_userrole_user";
		
	}
	
	@PostMapping("/userrole/view")
	public String addUserRole(@ModelAttribute UserRole userRole, Model model){
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String plainPassword = userRole.getPassword();
		String encodedPassword = passwordEncoder.encode(plainPassword);
		userRole.setPassword(encodedPassword);
		
		this.modelUserRole.addUserRole(userRole);
		model.addAttribute("listUserRole", modelUserRole.getAllUserRole());
		
		return "dashboard";
		
	}
	
	@GetMapping("/userrole/delete/{id}")
	public String deleteUserRole(@PathVariable String id, Model model) {
		
		this.modelUserRole.deleteUserRole(id);
		model.addAttribute("listUserRole", modelUserRole.getAllUserRole());
		
		return "redirect:/userrole/view";
		
	}
	
}
