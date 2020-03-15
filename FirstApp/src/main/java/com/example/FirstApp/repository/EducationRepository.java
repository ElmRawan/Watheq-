package com.example.FirstApp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Education;


@Repository
@Transactional
public interface EducationRepository extends CrudRepository<Education, String>{
	
	@Modifying
	@Query("UPDATE Education education SET education.edu_institute_name = :edu_institute_name WHERE education.edu_id = :edu_id")
	void updateEduName(@Param("edu_id") String edu_id, @Param("edu_institute_name") String edu_institute_name);
	
	
	@Modifying
	@Query("UPDATE Education education SET education.u_email = :u_email WHERE education.edu_id = :edu_id")
	void updateEmail(@Param("edu_id") String edu_id, @Param("u_email") String u_email);
	
	@Modifying
	@Query("UPDATE Education education SET education.u_phone = :u_phone WHERE education.edu_id = :edu_id")
	void updatePhoneNumber(@Param("edu_id") String edu_id, @Param("u_phone") String u_phone);

	
	@Modifying
	@Query("UPDATE Education education SET education.u_address = :u_address WHERE education.edu_id = :edu_id")
	void updateAddress(@Param("edu_id") String edu_id, @Param("u_address") String u_address);
	
	@Modifying
	@Query("UPDATE Education education SET education.u_password = :u_password WHERE education.edu_id = :edu_id")
	void updatePassword(@Param("edu_id") String edu_id, @Param("u_password") String u_password);
  
  
}