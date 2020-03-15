package com.example.FirstApp.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "Education_Institute")
@Getter
@Setter
public class Education extends WatheQ_User implements Serializable  {
	
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "edu_id",nullable = false, unique=true)
	@NotNull(message = "Education ID cannot be empty")
	private String edu_id;


	@Column(name = "edu_institute_name",nullable = false)
	@NotNull(message = "Education institute name cannot be empty")
	private String edu_institute_name;

	public Education() {
	}
	public Education(String edu_id) {
		this.edu_id = edu_id;
	}
	
	

	@Builder
	public Education(String u_email, String u_phone, String u_address, String u_password,String edu_id, String edu_institute_name) {
		super(u_email, u_phone, u_address, u_password);
		this.edu_id = edu_id;
		this.edu_institute_name = edu_institute_name;
	}

	
	@Override
	public String toString() {
		return "Education [edu_id=" + edu_id + ", edu_institute_name=" + edu_institute_name + "]";
	}
	public Education( String edu_id, String edu_institute_name) {
		super();
		this.edu_id = edu_id;
		this.edu_institute_name = edu_institute_name;
	}


}