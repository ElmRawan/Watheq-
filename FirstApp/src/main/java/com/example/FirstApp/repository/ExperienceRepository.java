package com.example.FirstApp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Experience;

@Repository
@Transactional
public interface ExperienceRepository extends CrudRepository<Experience, String>{
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.exp_position = :exp_position WHERE experience.exp_id = :exp_id")
	void updateExpPosition(@Param("exp_id") String exp_id, @Param("exp_position") String exp_position);
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.com_name = :com_name WHERE experience.exp_id = :exp_id")
	void updateComName(@Param("exp_id") String exp_id, @Param("com_name") String com_name);
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.s_date = :s_date WHERE experience.exp_id = :exp_id")
	void updateSdate(@Param("exp_id") String exp_id, @Param("s_date") String s_date);
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.e_date = :e_date WHERE experience.exp_id = :exp_id")
	void updateEdate(@Param("exp_id") String exp_id, @Param("e_date") String e_date);
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.ref_name = :ref_name WHERE experience.exp_id = :exp_id")
	void updateRefName(@Param("exp_id") String exp_id, @Param("ref_name") String ref_name);
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.ref_email = :ref_email WHERE experience.exp_id = :exp_id")
	void updateRefEmail(@Param("exp_id") String exp_id, @Param("ref_email") String ref_email);
	
	  
	}