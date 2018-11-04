package com.testBtpn.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testBtpn.springboot.dao.MahasiswaDAO;
import com.testBtpn.springboot.model.Mahasiswa;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
	
	MahasiswaDAO mahasiswaDAO;
	
	@PostMapping("/insert")
	public Mahasiswa createMahasiswa(@Valid @RequestBody Mahasiswa data) {
		return mahasiswaDAO.save(data);
	}
	
	@GetMapping("/readAll")
	public List<Mahasiswa> getAllMahasiswa(){
		return mahasiswaDAO.findAll();
	}
	
	@GetMapping("/select{id}")
	public ResponseEntity<Mahasiswa> getMahasiswaId(@PathVariable(value="id")Long nim){
		Mahasiswa mhs = mahasiswaDAO.findOne(nim);
		if(mhs==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(mhs);
	}
	
	@PutMapping("/update{id}")
	public ResponseEntity<Mahasiswa> updateMahasiswa(@PathVariable(value="id")
						Long nim, @Valid @RequestBody Mahasiswa mhsDetail){
		
		Mahasiswa mhs = mahasiswaDAO.findOne(nim);
		if(mhs==null) {
			return ResponseEntity.notFound().build();
		}
		mhs.setNama(mhs.getNama());
		mhs.setTanggallahir(mhs.getTanggallahir());
		
		Mahasiswa updateMahasiswa = mahasiswaDAO.save(mhs);
		return ResponseEntity.ok().body(updateMahasiswa);
	}
	
	@DeleteMapping("/delete{id}")
	public ResponseEntity<Mahasiswa> deleteMahasiswa(@PathVariable(value="id")Long nim){
		Mahasiswa mhs = mahasiswaDAO.findOne(nim);
		if(mhs==null) {
			return ResponseEntity.notFound().build();
		}
		mahasiswaDAO.delete(mhs);
		return ResponseEntity.ok().build();
	}
}
