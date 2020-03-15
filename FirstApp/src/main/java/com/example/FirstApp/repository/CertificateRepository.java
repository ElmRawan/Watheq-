package com.example.FirstApp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.FirstApp.model.Certificate;


public interface CertificateRepository extends CrudRepository<Certificate, String>{
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.cert_date = :cert_date WHERE certificate.i_id = :i_id")
	void updateCertDate(@Param("i_id") String i_id, @Param("cert_date") String cert_date);

	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.cert_degree = :cert_degree WHERE certificate.i_id = :i_id")
	void updateCertDegree(@Param("i_id") String i_id, @Param("cert_degree") String cert_degree);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.cert_major = :cert_major WHERE certificate.i_id = :i_id")
	void updateCertMajor(@Param("i_id") String i_id, @Param("cert_major") String cert_major);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.uni_name = :uni_name WHERE certificate.i_id = :i_id")
	void updateUniName(@Param("i_id") String i_id, @Param("uni_name") String uni_name);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.cert_gpa = :cert_gpa WHERE certificate.i_id = :i_id")
	void updateCertGPA(@Param("i_id") String i_id, @Param("cert_gpa") String cert_gpa);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.cert_attach = :cert_attach WHERE certificate.i_id = :i_id")
	void updateCertAttach(@Param("i_id") String i_id, @Param("cert_attach") String cert_attach);
	
	
	}