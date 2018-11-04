package com.testBtpn.springboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="mahasiswa")
@EntityListeners(AuditingEntityListener.class)


public class Khs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idkhs;
	
	@NotBlank
	private String namamatakuliah;
	
	@NotBlank
	private Date nilai;
	
	@NotBlank
	private Mahasiswa nimmahasiswa;
	
	public int getIdkhs() {
		return idkhs;
	}

	public void setIdkhs(int idkhs) {
		this.idkhs = idkhs;
	}

	public String getNamamatakuliah() {
		return namamatakuliah;
	}

	public void setNamamatakuliah(String namamatakuliah) {
		this.namamatakuliah = namamatakuliah;
	}

	public Date getNilai() {
		return nilai;
	}

	public void setNilai(Date nilai) {
		this.nilai = nilai;
	}

	public Mahasiswa getNimmahasiswa() {
		return nimmahasiswa;
	}

	public void setNimmahasiswa(Mahasiswa nimmahasiswa) {
		this.nimmahasiswa = nimmahasiswa;
	}
}
