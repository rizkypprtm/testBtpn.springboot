package com.testBtpn.springboot.repository;


import com.testBtpn.springboot.model.Mahasiswa; 
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {

}
 