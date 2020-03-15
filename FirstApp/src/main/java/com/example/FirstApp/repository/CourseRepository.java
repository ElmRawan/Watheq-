package com.example.FirstApp.repository;


import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Course;

@Repository
@Transactional
//@NamedQueries(value = { @javax.persistence.NamedQuery }){}
public interface CourseRepository extends CrudRepository<Course, String>{
	
	@Modifying
	@Query("UPDATE Course course SET course.course_name = :course_name WHERE course.course_id = :course_id")
	void updateCourseName(@Param("course_id") String course_id, @Param("course_name") String course_name);
	
	@Modifying
	@Query("UPDATE Course course SET course.s_date = :s_date WHERE course.course_id = :course_id")
	void updateSDate(@Param("course_id") String course_id, @Param("s_date") String s_date);
	
	@Modifying
	@Query("UPDATE Course course SET course.e_date = :e_date WHERE course.course_id = :course_id")
	void updateEDate(@Param("course_id") String course_id, @Param("e_date") String e_date);
	
	@Modifying
	@Query("UPDATE Course course SET course.course_institute_name = :course_institute_name WHERE course.course_id = :course_id")
	void updateCourseInstituteName(@Param("course_id") String course_id, @Param("course_institute_name") String course_institute_name);
	
	@Modifying
	@Query("UPDATE Course course SET course.course_attch = :course_attch WHERE course.course_id = :course_id")
	void updateCourseAttch(@Param("course_id") String course_id, @Param("course_attch") String course_attch);
	  
	}