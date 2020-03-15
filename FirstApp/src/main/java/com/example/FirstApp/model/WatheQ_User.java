
package com.example.FirstApp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@MappedSuperclass
public class WatheQ_User implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L; 


	//	 @GeneratedValue(strategy = GenerationType.AUTO)
	//	  private long u_id;

	@Column(name = "u_email", nullable = false, unique=true)
	@NotNull(message = "Email cannot be empty")
	@Email(message = "Email should be valid example@example.com")
	private String u_email;

	@Column(name = "u_phone",nullable = false, unique=true)
	@NotNull(message = "Phone number cannot be empty")
	@Pattern(regexp = "(\\+966|0)[0-9]{9}")
	private String u_phone;

	@Column(name = "u_address")
	private String u_address;

	@Column(name = "u_password",nullable = false)
	@NotNull(message = "Password cannot be empty")
	//@Min(value = 8, message = "Password should not be less than 8")
	private String u_password;

	public WatheQ_User() {
	}

	public WatheQ_User(String u_email, String u_phone, String u_address, String u_password) {
		super();
		this.u_email = u_email;
		this.u_phone = u_phone;
		this.u_address = u_address;
		this.u_password = u_password;
	}




	@Override
	public String toString() {
		return "User [ u_email=" + u_email + ", u_phone=" + u_phone + ", u_address=" + u_address
				+ ", u_password=" + u_password + "]";
	}


}