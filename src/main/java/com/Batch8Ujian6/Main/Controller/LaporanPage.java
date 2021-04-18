package com.Batch8Ujian6.Main.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Batch8Ujian6.Main.Entity.Laporan;
import com.Batch8Ujian6.Main.Repository.LaporanRepository;
import com.Batch8Ujian6.Main.Services.ModelLaporan;
import com.Batch8Ujian6.Main.Utility.FileUtility;

@Controller
public class LaporanPage {

	@Autowired
	ModelLaporan modelLaporan;
	
	@Autowired
	LaporanRepository laporanRepository;
	
	@GetMapping("/laporan/view")
	public String viewIndexLaporan (Model model) {
		
		model.addAttribute("listLaporan", modelLaporan.getAllLaporan());
		model.addAttribute("active", 3);
		
		return "view_laporan";
		
	}
	
	@GetMapping("/laporan/add")
	public String viewAddLaporan(Model model) {
		
		model.addAttribute("laporan", new Laporan());
		model.addAttribute("active", 2);
		
		return "add_laporan";
		
	}

	@PostMapping("/laporan/view")
	public String addLaporan(@RequestParam(value = "file") MultipartFile file, @ModelAttribute Laporan laporan, Model model) throws IOException{
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());		
		String uploadDir = "user-photos/";
		FileUtility.saveFile(uploadDir, fileName, file);
		laporan.setGambarBukti("/" + uploadDir + fileName);
		
		this.modelLaporan.addLaporan(laporan);
		model.addAttribute("listLaporan", modelLaporan.getAllLaporan());
		
		return "add_laporan";
		
	}
	
	@PutMapping("/laporan/approve/{id}")
	public String viewApproveLaporan(@RequestBody Laporan laporan) {
		
		laporan.setStatus("Approve");
		laporanRepository.save(laporan);
		
		
		return "redirect:/laporan/view";
		
	}
	
	@PutMapping("/laporan/reject/{id}")
	public String viewRejectLaporan(@RequestBody Laporan laporan) {
		
		laporan.setStatus("Reject");
		laporanRepository.save(laporan);
		
		
		return "redirect:/laporan/view";
		
	}
	
	@GetMapping("/laporan/delete/{id}")
	public String deleteLaporan(@PathVariable String id, Model model) {
		
		this.modelLaporan.deleteLaporan(id);
		model.addAttribute("listLaporan", modelLaporan.getAllLaporan());
		
		return "redirect:/laporan/view";
		
	}
	
}
