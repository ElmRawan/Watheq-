package com.example.FirstApp.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Certificate")
@Getter
@Setter
public class Certificate implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ce_idauto;

	//Joining Table
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "i_id", referencedColumnName="i_id" ,nullable = false)
	//@Size(min=10, max=10)
	private Individual i_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "edu_id", nullable = false)
	private Education edu_id;


	//Certificate ID
	@Column(name = "cert_id",nullable = false)
	@NotNull (message = "Certificate ID cannot be empty")
	private String cert_id;

	// certificate degree (BA, Master,..)
	@Column(name = "cert_degree",nullable = false)
	@NotNull(message = "Certificate degree cannot be empty")
	private String cert_degree;

	//Name of University
	@Column(name = "uni_name",nullable = false)
	@NotNull(message = "University name cannot be empty")
	private String uni_name;

	//Date of graduation
	@Column(name = "cert_date",nullable = false)
	@NotNull(message = "Graduation date cannot be empty")
	private Timestamp cert_date;

	//User who added the certificate
	@Column(name = "cert_addby",nullable = false)
	@NotNull
	private String cert_addby;

	//individual certificate major 
	@Column(name = "cert_major",nullable = false)
	@NotNull(message = "Certificate major cannot be empty")
	private String cert_major;

	//individual certificate GPA
	@Column(name = "cert_gpa",nullable = false)
	@NotNull(message = "GPA cannot be empty")
	@Min(value = 0, message = "GPA should not be less than 0")
	@Max(value = 5, message = "GPA should not be greater than 5 ")
	private double cert_gpa;


	// certificate attachment
	@Column(name = "cert_attach",nullable = false)
    @NotNull(message = "Certificate attachment cannot be empty")
	private String cert_attach;

	
	
	public Certificate() {
	}


	@Builder
	public Certificate( Individual i_id, Education edu_id, String cert_id, String cert_degree, String uni_name,
		Timestamp cert_date, String cert_addby, String cert_major, double cert_gpa, String cert_attach) {
	super();
	this.i_id = i_id;
	this.edu_id = edu_id;
	this.cert_id = cert_id;
	this.cert_degree = cert_degree;
	this.uni_name = uni_name;
	this.cert_date = cert_date;
	this.cert_addby = cert_addby;
	this.cert_major = cert_major;
	this.cert_gpa = cert_gpa;
	this.cert_attach = cert_attach;
}



	@Override
	public String toString() {
		return "Certificate [ce_idauto=" + ce_idauto + ", i_id=" + i_id + ", edu_id=" + edu_id + ", cert_id=" + cert_id
				+ ", cert_degree=" + cert_degree + ", uni_name=" + uni_name + ", cert_date=" + cert_date
				+ ", cert_addby=" + cert_addby + ", cert_major=" + cert_major + ", cert_gpa=" + cert_gpa
				+ ", cert_attach=" + cert_attach + ", toString()=" + super.toString() + "]";
	}

	
	
	


	




}

