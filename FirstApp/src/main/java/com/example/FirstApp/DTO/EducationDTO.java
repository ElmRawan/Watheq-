package com.example.FirstApp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDTO extends WatheQ_UserDTO{

	private String edu_id;


	private String edu_institute_name;

	
	

	public EducationDTO() {
		super();
	}
		
	

	public EducationDTO(String u_email, String u_phone, String u_address, String u_password, String edu_id,
			String edu_institute_name) {
		super(u_email, u_phone, u_address, u_password);
		this.edu_id = edu_id;
		this.edu_institute_name = edu_institute_name;
	}




}
