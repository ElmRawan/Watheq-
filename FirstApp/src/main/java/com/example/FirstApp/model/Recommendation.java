package com.example.FirstApp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Recommendation")
@Getter
@Setter
public class Recommendation implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	//Recommendation ID
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String reco_id;

	//Joining Tables
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "i_id", referencedColumnName="i_id", nullable = false)
	//@Size(min=10, max=10)
	private Individual i_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "com_cr", nullable = false)
	private Company com_cr;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "edu_id", nullable = false)
	private Education edu_id;


	//Person who write it
	@Column(name = "reco_from",nullable = false)
	@NotNull(message = "Recommendation from cannot be empty")
	private String reco_from;

	//Recommendation Creation date
	@Column(name = "reco_date",nullable = false)
	@NotNull(message = "Recommendation  creation date cannot be empty")
	private Date reco_date;

	//User Who added Recommendation 
	@Column(name = "reco_addby",nullable = false)
	private String reco_addby;

	//URL Recommendation attachment
	@Column(name = "reco_attach",nullable = false)
	@NotNull(message = "Recommendation attachment cannot be empty")
	private String reco_attach;

	//The name of the institute Who added Recommendation 
	@Column(name = "reco_institute_name",nullable = false)
	private String reco_institute_name;


	protected Recommendation() {
	}


	@Builder
	public Recommendation(String reco_id, Individual i_id, Company com_cr, Education edu_id, String reco_from,
			Date reco_date, String reco_addby, String reco_attach, String reco_institute_name) {
		super();
		this.reco_id = reco_id;
		this.i_id = i_id;
		this.com_cr = com_cr;
		this.edu_id = edu_id;
		this.reco_from = reco_from;
		this.reco_date = reco_date;
		this.reco_addby = reco_addby;
		this.reco_attach = reco_attach;
		this.reco_institute_name = reco_institute_name;
	}



	@Override
	public String toString() {
		return "Recommendation [reco_id=" + reco_id + ", i_id=" + i_id + ", com_cr=" + com_cr + ", edu_id=" + edu_id
				+ ", reco_from=" + reco_from + ", reco_date=" + reco_date + ", reco_addby=" + reco_addby
				+ ", reco_attach=" + reco_attach + ", reco_institute_name=" + reco_institute_name + ", toString()="
				+ super.toString() + "]";
	}

















}
