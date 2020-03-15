package com.example.FirstApp.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.FirstApp.model.Company;


@Repository
@Transactional

public interface CompanyRepository extends  CrudRepository<Company, String>{
	
	@Modifying
	@Query("UPDATE Company company SET company.s_date = :s_date WHERE company.com_cr = :com_cr")
	void updateStartDate(@Param("com_cr") String com_cr, @Param("s_date") String s_date);

	@Modifying
	@Query("UPDATE Company company SET company.e_date = :e_date WHERE company.com_cr = :com_cr")
	void updateEndDate(@Param("com_cr") String com_cr, @Param("e_date") String e_date);
	
	@Modifying
	@Query("UPDATE Company company SET company.com_name = :com_name WHERE company.com_cr = :com_cr")
	void updateComName(@Param("com_cr") String com_cr, @Param("com_name") String com_name);
	
	@Modifying
	@Query("UPDATE Company company SET company.u_email = :u_email WHERE company.com_cr = :com_cr")
	void updateEmail(@Param("com_cr") String com_cr, @Param("u_email") String u_email);
	
	@Modifying
	@Query("UPDATE Company company SET company.u_phone = :u_phone WHERE company.com_cr = :com_cr")
	void updatePhoneNumber(@Param("com_cr") String com_cr, @Param("u_phone") String u_phone);

	
	@Modifying
	@Query("UPDATE Company company SET company.u_address = :u_address WHERE company.com_cr = :com_cr")
	void updateAddress(@Param("com_cr") String com_cr, @Param("u_address") String u_address);
	
	@Modifying
	@Query("UPDATE Company company SET company.u_password = :u_password WHERE company.com_cr = :com_cr")
	void updatePassword(@Param("com_cr") String com_cr, @Param("u_password") String u_password);
  
}