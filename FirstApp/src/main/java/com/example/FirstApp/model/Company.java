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
@Table(name = "Company")
@Getter
@Setter
public class Company extends WatheQ_User implements Serializable  {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "com_cr",nullable = false, unique=true)
	@NotNull(message = "Company CR cannot be empty")
	private String com_cr;

	// Name of company
	@Column(name = "com_name", nullable = false)
	@NotNull(message = "Company name cannot be empty")
	private String com_name;

	//Company CR starting Date
	@Column(name = "s_date", nullable = false)
	@NotNull(message = "CR start date cannot be empty")
	private Date s_date;

	//Company CR ending date
	@Column(name = "e_date", nullable = false)
	@NotNull(message = "CR end date cannot be empty")
	private Date e_date;

	public Company() {
	}

	@Builder
	public Company(String u_email, String u_phone, String u_address, String u_password,String com_cr, String com_name, Date s_date, Date e_date) {
		super(u_email, u_phone, u_address, u_password);
		this.com_cr = com_cr;
		this.com_name = com_name;
		this.s_date = s_date;
		this.e_date = e_date;
	}

	
	@Override
	public String toString() {
		return "Company [com_cr=" + com_cr + ", com_name=" + com_name + ", s_date=" + s_date + ", e_date=" + e_date
				+ "]";
	}



}
