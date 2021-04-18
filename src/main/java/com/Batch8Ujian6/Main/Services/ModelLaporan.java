package com.Batch8Ujian6.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian6.Main.Entity.Laporan;
import com.Batch8Ujian6.Main.Repository.LaporanRepository;

@Service
public class ModelLaporan implements ModelLaporanInterface{

	@Autowired
	LaporanRepository laporanRepository;

	@Override
	public List<Laporan> getAllLaporan() {

		return (List<Laporan>) this.laporanRepository.findAll();
		
	}

	@Override
	public Laporan getLaporanByNama(String nama) {

		return this.laporanRepository.findByNama(nama);
		
	}

	@Override
	public Laporan addLaporan(Laporan laporan) {

		return this.laporanRepository.save(laporan);
		
	}

	@Override
	public Laporan getLaporanById(String id) {

		return ((Laporan)this.laporanRepository.findByIdLaporan(Long.parseLong(id)));
		
	}

	@Override
	public void deleteLaporan(String id) {

		this.laporanRepository.deleteById(Long.parseLong(id));
		
	}
	
}
