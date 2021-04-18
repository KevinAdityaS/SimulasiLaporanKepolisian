package com.Batch8Ujian6.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Batch8Ujian6.Main.Entity.Admin;
import com.Batch8Ujian6.Main.Entity.Laporan;
import com.Batch8Ujian6.Main.Entity.User;
import com.Batch8Ujian6.Main.Entity.UserRole;
import com.Batch8Ujian6.Main.Repository.AdminRepository;
import com.Batch8Ujian6.Main.Repository.LaporanRepository;
import com.Batch8Ujian6.Main.Repository.UserRepository;

@SpringBootApplication
public class Batch8Ujian6Application implements CommandLineRunner{

	@Autowired
	AdminRepository adminRepository;

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LaporanRepository laporanRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Batch8Ujian6Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception{
		
//		Laporan laporan = new Laporan();
//		laporan.setNama("Sayu");
//		laporan.setKejadian("Pemerkosaan");
//		laporan.setAlamat("Hokkaido");
//		laporan.setStatus("Pending");
//		laporan.setKeterangan("Dia jahat, aku diginiin dan digituin! :(");
//		laporan.setGambarBukti("https://i.ytimg.com/vi/y7BU-LnfRZg/maxresdefault.jpg");
//		
//		Admin admin1 = new Admin();
//		Admin admin2 = new Admin();
//		User user1 = new User();
//		User user2 = new User();
//		
//		UserRole userRoleAdmin1 = new UserRole();
//		userRoleAdmin1.setNama("Kevin");
//		userRoleAdmin1.setUsername("kevinadityas");
//		userRoleAdmin1.setPassword("123456");
//		userRoleAdmin1.setRole("admin");
//		
//		UserRole userRoleAdmin2 = new UserRole();
//		userRoleAdmin2.setNama("Aditya");
//		userRoleAdmin2.setUsername("adityakevins");
//		userRoleAdmin2.setPassword("123456");
//		userRoleAdmin2.setRole("admin");
//		
//		UserRole userRoleUser1 = new UserRole();
//		userRoleUser1.setNama("Sayu");
//		userRoleUser1.setUsername("sayusayu");
//		userRoleUser1.setPassword("123456");
//		userRoleUser1.setRole("user");
//		
//		UserRole userRoleUser2 = new UserRole();
//		userRoleUser2.setNama("Yoshida");
//		userRoleUser2.setUsername("yoshidayoshida");
//		userRoleUser2.setPassword("123456");
//		userRoleUser2.setRole("user");
//		
//		admin1.setUserRole(userRoleAdmin1);
//		admin2.setUserRole(userRoleAdmin2);
//		user1.setUserRole(userRoleUser1);
//		user2.setUserRole(userRoleUser2);
//		
//		this.laporanRepository.save(laporan);
//		this.adminRepository.save(admin1);
//		this.adminRepository.save(admin2);
//		this.userRepository.save(user1);
//		this.userRepository.save(user2);
		
	}
	
}
