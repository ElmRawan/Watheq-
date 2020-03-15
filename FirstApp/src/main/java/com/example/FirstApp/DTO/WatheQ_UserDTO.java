package com.example.FirstApp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WatheQ_UserDTO {
	
	  private String u_email;
	 
	 
	  private String u_phone;
	 
	
	  private String u_address;
	 
	
	  private String u_password;
	  
	  

	public WatheQ_UserDTO() {
		
	}

	public WatheQ_UserDTO(String u_email, String u_phone, String u_address, String u_password) {
		this.u_email = u_email;
		this.u_phone = u_phone;
		this.u_address = u_address;
		this.u_password = u_password;
	}
	

}
