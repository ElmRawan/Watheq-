package com.example.FirstApp.DTO;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class IndividualDTO extends WatheQ_UserDTO {

	private String i_id;
	
	
	private String fName;

	
	private String lName;

	
	private Date dob;

	
	private String age;

	
	private Boolean gender;
	

	private Boolean married;

	
	private String job;

	
	private String major;

	
	private String cv_attach;
	
	
	
	
	
	public IndividualDTO() {
		super();
	}
	
	

	public IndividualDTO(String u_email, String u_phone, String u_address, String u_password, String i_id, String fName,
			String lName, Date dob, String age, Boolean gender, Boolean married, String job, String major,
			String cv_attach) {
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


}
