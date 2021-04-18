package com.Batch8Ujian6.Main.Services;

import java.util.List;

import com.Batch8Ujian6.Main.Entity.Laporan;

public interface ModelLaporanInterface {

	public List<Laporan> getAllLaporan();
	
	public Laporan getLaporanByNama(String nama);
	
	public Laporan addLaporan(Laporan laporan);
	
	public Laporan getLaporanById(String id);
	
	public void deleteLaporan(String id);
	
}
