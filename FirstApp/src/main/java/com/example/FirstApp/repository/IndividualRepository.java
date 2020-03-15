package com.example.FirstApp.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Individual;



@Repository
@Transactional
public interface IndividualRepository extends CrudRepository<Individual, String>{

	@Modifying
	@Query("UPDATE Individual individual SET individual.u_email = :u_email WHERE individual.i_id = :i_id")
	void updateEmail(@Param("i_id") String i_id, @Param("u_email") String u_email);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.u_phone = :u_phone WHERE individual.i_id = :i_id")
	void updatePhoneNumber(@Param("i_id") String i_id, @Param("u_phone") String u_phone);

	@Modifying
	@Query("UPDATE Individual individual SET individual.u_address = :u_address WHERE individual.i_id = :i_id")
	void updateAddress(@Param("i_id") String i_id, @Param("u_address") String u_address);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.u_password = :u_password WHERE individual.i_id = :i_id")
	void updatePassword(@Param("i_id") String i_id, @Param("u_password") String u_password);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.fName = :fName WHERE individual.i_id = :i_id")
	void updateFName(@Param("i_id") String i_id, @Param("fName") String fName);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.lName = :lName WHERE individual.i_id = :i_id")
	void updateLName(@Param("i_id") String i_id, @Param("lName") String lName);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.dob = :dob WHERE individual.i_id = :i_id")
	void updateDOB(@Param("i_id") String i_id, @Param("dob") String dob);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.age = :age WHERE individual.i_id = :i_id")
	void updateAge(@Param("i_id") String i_id, @Param("age") String age);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.gender = :gender WHERE individual.i_id = :i_id")
	void updateGender(@Param("i_id") String i_id, @Param("gender") String gender);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.married = :married WHERE individual.i_id = :i_id")
	void updateMarried(@Param("i_id") String i_id, @Param("married") String married);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.job = :job WHERE individual.i_id = :i_id")
	void updateJob(@Param("i_id") String i_id, @Param("job") String job);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.major = :major WHERE individual.i_id = :i_id")
	void updateMajor(@Param("i_id") String i_id, @Param("major") String major);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.cv_attach = :cv_attach WHERE individual.i_id = :i_id")
	void updateCvAttach(@Param("i_id") String i_id, @Param("cv_attach") String cv_attach);

}


