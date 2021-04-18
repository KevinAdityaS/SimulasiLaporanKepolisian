package com.Batch8Ujian6.Main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

	@GetMapping("/login")
	public String loginPage(Model model) {
		
		return "login";
		
	}
	
	@GetMapping("/dashboard")
	public String dashboardPage(Model model) {
		
		return "dashboard";
		
	}
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
				
		return "index";
		
	}
	
}
