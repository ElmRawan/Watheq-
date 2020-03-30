package com.example.FirstApp.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Language")
@Getter
@Setter
public class Language implements Serializable  {


	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long lang_id;

	//Joining Tables
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "i_id", referencedColumnName="i_id", nullable = false)
	//@Size(min=10, max=10)
	private Individual i_id;

	@Column(name = "language_id",nullable = false)
	private String language_id;

	//English or French ..etc
	@Column(name = "language_name",nullable = false)
	private String language_name;

	//ILETS or Tofel ..etc
	@Column(name = "lang_cert_type")
	private String lang_cert_type;

	//
	@Column(name = "language_date",nullable = false)
	@NotNull(message = "Language start date cannot be empty")
	private Date language_date;

	//           @Column(name = "duration_valid")
	//           private String duration_valid;

	@Column(name = "language_institute_name",nullable = false)
	@NotNull(message = "Language institute name cannot be empty")
	private String language_institute_name;

	@Column(name = "language_attach",nullable = false)
	@NotNull(message = "Language attachment cannot be empty")
	private String language_attach;

	public Language() {
	}
	@Builder
	public Language(Individual i_id, String language_id, String language_name, String lang_cert_type,
			Date language_date, String language_institute_name, String language_attach) {
		super();
		this.i_id = i_id;
		this.language_id = language_id;
		this.language_name = language_name;
		this.lang_cert_type = lang_cert_type;
		this.language_date = language_date;
		this.language_institute_name = language_institute_name;
		this.language_attach = language_attach;
	}


	@Override
	public String toString() {
		return "Language [i_id=" + i_id + ", language_id=" + language_id + ", language_name=" + language_name
				+ ", lang_cert_type=" + lang_cert_type + ", language_date=" + language_date
				+ ", language_institute_name=" + language_institute_name + ", language_attach=" + language_attach
				+ ", toString()=" + super.toString() + "]";
	}









}
