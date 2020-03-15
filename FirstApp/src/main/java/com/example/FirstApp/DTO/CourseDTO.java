package com.example.FirstApp.DTO;

import java.sql.Timestamp;


import com.example.FirstApp.model.Company;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CourseDTO {
	
	private String course_id;

	private Individual i_id;

	private Company com_cr;

	private Education edu_id;

	private String course_name;

	private Timestamp s_date;

	private Timestamp e_date;

	private String  course_addby;

	private String course_institute_name;

	private String course_attch;
	


	public CourseDTO() {
		super();
	}

	
	

	public CourseDTO(String course_id, Individual i_id, Company com_cr, Education edu_id, String course_name,
			Timestamp s_date, Timestamp e_date, String course_addby, String course_institute_name,
			String course_attch) {
		super();
		this.course_id = course_id;
		this.i_id = i_id;
		this.com_cr = com_cr;
		this.edu_id = edu_id;
		this.course_name = course_name;
		this.s_date = s_date;
		this.e_date = e_date;
		this.course_addby = course_addby;
		this.course_institute_name = course_institute_name;
		this.course_attch = course_attch;
	}


}
