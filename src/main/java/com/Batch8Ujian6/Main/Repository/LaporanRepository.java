package com.Batch8Ujian6.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian6.Main.Entity.Laporan;

public interface LaporanRepository extends CrudRepository<Laporan, Long>{

	public Laporan findByIdLaporan(Long id);
	public Laporan findByNama(String nama);
	
}
