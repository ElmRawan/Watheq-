package com.example.FirstApp.model;

import java.io.Serializable;
import java.sql.Timestamp;

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
@Table(name = "Course")
@Getter
@Setter
public class Course implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private String course_id;

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


	@Column(name = "course_name",nullable = false)
	@NotNull(message = "Course name cannot be empty")
	private String course_name;

	@Column(name = "s_date",nullable = false)
	@NotNull(message = "Course start date cannot be empty")
	private Timestamp s_date;

	@Column(name = "e_date")
	private Timestamp e_date;

	@Column(name = "course_addby",nullable = false)
	private String  course_addby;

	@Column(name = "course_institute_name",nullable = false)
	@NotNull(message = "Course institute cannot be empty")
	private String course_institute_name;

	@Column(name = "course_attch")
	private String course_attch;

	public Course() {
	}





	@Builder
	public Course(String course_id, Individual i_id, Company com_cr, Education edu_id, String course_name,
			Timestamp s_date, Timestamp e_date, String course_addby, String course_institute_name,
			String course_attch) {
		super();
		this.course_id = course_id;
		this.i_id = i_id;
		this.com_cr = com_cr;
		this.edu_id = edu_id;
		this.course_name = course_name;
		this.s_date = s_date;
		this.e_date = e_date;
		this.course_addby = course_addby;
		this.course_institute_name = course_institute_name;
		this.course_attch = course_attch;
	}


	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", i_id=" + i_id + ", com_cr=" + com_cr + ", edu_id=" + edu_id
				+ ", course_name=" + course_name + ", s_date=" + s_date + ", e_date=" + e_date + ", course_addby="
				+ course_addby + ", course_institute_name=" + course_institute_name + ", course_attch=" + course_attch
				+ ", toString()=" + super.toString() + "]";
	}













}
