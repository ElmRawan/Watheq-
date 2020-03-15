package com.example.FirstApp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name = "individual")
@Getter
@Setter
public class Individual extends WatheQ_User implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "i_id",nullable = false, unique=true)
	@NotNull(message = "National ID cannot be empty")
//	@Size(min=10, max=10)
	private String i_id;

	@Column(name = "fname",nullable = false)
	@NotNull(message = "First name cannot be empty")
	private String fName;

	@Column(name = "lname",nullable = false)
	@NotNull(message = "Last name cannot be empty")
	private String lName;


	@Column(name = "dob",nullable = false)
	@NotNull(message = "Date of birth cannot be empty")
	private Date dob;

	@Column(name = "age")
	private String age;

	@Column(name = "gender",nullable = false)
	@NotNull(message = "Gender cannot be empty")
	private Boolean gender;

	@Column(name = "married")
	private Boolean married;

	@Column(name = "job")
	private String job;

	@Column(name = "major",nullable = false)
	@NotNull(message = "Major cannot be empty")
	private String major;

	@Column(name = "cv_attach")
	private String cv_attach;


	public Individual(String i_id) {
		this.i_id = i_id;
	}
	public Individual() {
	}

	@Builder
	public Individual(String u_email, String u_phone, String u_address, String u_password,String i_id, String fName, String lName, Date dob, String age, Boolean gender, Boolean married,
			String job, String major, String cv_attach) {

		super(u_email, u_phone, u_address, u_password);
		this.i_id = i_id;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.married = married;
		this.job = job;
		this.major = major;
		this.cv_attach = cv_attach;
	}



	@Override
	public String toString() {
		return "Individual [i_id=" + i_id + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", age=" + age
				+ ", gender=" + gender + ", state=" + married + ", job=" + job + ", major=" + major + ", cv_attach="
				+ cv_attach + "]";
	}




}


