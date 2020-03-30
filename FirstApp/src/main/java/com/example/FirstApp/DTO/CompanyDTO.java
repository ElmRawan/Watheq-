package com.example.FirstApp.DTO;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDTO extends WatheQ_UserDTO {

	private String com_cr;

	private String com_name;
	
	private Date s_date;

	private Date e_date;
	
	


	public CompanyDTO() {
		super();
		
	}
	
	
	
	

	public CompanyDTO(String u_email, String u_phone, String u_address, String u_password, String com_cr,
			String com_name, Date s_date, Date e_date) {
		super(u_email, u_phone, u_address, u_password);
		this.com_cr = com_cr;
		this.com_name = com_name;
		this.s_date = s_date;
		this.e_date = e_date;
	}

}
