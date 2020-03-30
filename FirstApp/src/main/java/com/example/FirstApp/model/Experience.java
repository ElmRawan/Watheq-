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
@Table(name = "Experience")
@Getter
@Setter
public class Experience implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	//Experience auto generate
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private String exp_id;

	//Joining Tables
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "i_id", referencedColumnName="i_id", nullable = false)
//	@Size(min=10, max=10)
	private Individual i_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "com_cr", nullable = false)
	private Company com_cr;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "edu_id", nullable = false)
	private Education edu_id;


	@Column(name = "exp_position",nullable = false)
	@NotNull(message = "Experince position cannot be empty")
	private String exp_position;

	@Column(name = "com_name",nullable = false)
	@NotNull(message = "Company name cannot be empty")
	private String com_name;

	@Column(name = "s_date",nullable = false)
	@NotNull(message = "Experince start date cannot be empty")
	private Date s_date;

	@Column(name = "e_date")
	private Date e_date;

	@Column(name = "exp_addby",nullable = false)
	private String exp_addby;

	@Column(name = "ref_name")
	private String ref_name;

	@Column(name = "ref_email")
	private String ref_email;

	public Experience() {
	}



	@Builder
	public Experience(String exp_id, Individual i_id, Company com_cr, Education edu_id, String exp_position,
			String com_name, Date s_date, Date e_date, String exp_addby, String ref_name,
			String ref_email) {
		super();
		this.exp_id = exp_id;
		this.i_id = i_id;
		this.com_cr = com_cr;
		this.edu_id = edu_id;
		this.exp_position = exp_position;
		this.com_name = com_name;
		this.s_date = s_date;
		this.e_date = e_date;
		this.exp_addby = exp_addby;
		this.ref_name = ref_name;
		this.ref_email = ref_email;
	}





	@Override
	public String toString() {
		return "Experience [i_id=" + i_id + ", com_cr=" + com_cr + ", edu_id=" + edu_id + ", exp_position="
				+ exp_position + ", com_name=" + com_name + ", s_date=" + s_date + ", e_date=" + e_date + ", exp_addby="
				+ exp_addby + ", ref_name=" + ref_name + ", ref_email=" + ref_email + ", toString()="
				+ super.toString() + "]";
	}







}
