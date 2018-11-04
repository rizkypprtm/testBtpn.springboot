package com.testBtpn.springboot.model;

import java.util.Date;
//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="mahasiswa")
@EntityListeners(AuditingEntityListener.class)


public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nim;
	
	@NotBlank
	private String nama;
	
	@NotBlank
	private Date tanggallahir;
	
	//private Set<Khs> khs;
	
	
	public long getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTanggallahir() {
		return tanggallahir;
	}

	public void setTanggallahir(Date tanggallahir) {
		this.tanggallahir = tanggallahir;
	}
	
//	 @OneToMany(mappedBy = "mahasiswa", cascade = CascadeType.ALL)
//	    public Set<Khs> getBooks() {
//	        return khs;
//	    }
//
//	    public void setBooks(Set<Khs> khs) {
//	        this.khs = khs;
//	    }
//
//	    @Override
//	    public String toString() {
//	        String result = String.format(
//	                "Category[nim=%d, nama='%s', tanggallahir='%a']%n",
//	                nim, nama, tanggallahir);
//	        if (khs != null) {
//	            for(Khs khs : khs) {
//	                result += String.format(
//	                        "Khs[idkhs=%d, namamatakuliah='%s', nilai='%a']%n",
//	                        khs.getIdkhs(), khs.getNamamatakuliah(), khs.getNilai());
//	            }
//	        }
//
//	        return result;
//	    }
}
