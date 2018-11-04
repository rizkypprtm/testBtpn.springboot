package com.testBtpn.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testBtpn.springboot.model.Mahasiswa;
import com.testBtpn.springboot.repository.MahasiswaRepository;

@Service
public class MahasiswaDAO {

	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	
	public Mahasiswa save(Mahasiswa data) {
		return mahasiswaRepository.save(data);
	}
	
	public List<Mahasiswa> findAll(){
		return mahasiswaRepository.findAll();
	}
	
	public Mahasiswa findOne(Long nim) {
		return mahasiswaRepository.findOne(nim);
	}
	
	public void delete (Mahasiswa data) {
		mahasiswaRepository.delete(data);
	}
}
