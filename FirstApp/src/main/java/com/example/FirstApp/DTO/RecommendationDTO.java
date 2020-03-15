package com.example.FirstApp.DTO;

import java.sql.Timestamp;
import com.example.FirstApp.model.Company;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecommendationDTO {
	
	private long reco_id;
	
	private Individual i_id;
	
	private Company com_cr;
	
	private Education edu_id;

	private String reco_from;

	private Timestamp reco_date;

	private String reco_addby;

	private String reco_attach;

	private String reco_institute_name;


	
	
	

	public RecommendationDTO() {
		super();
	}

	
	

	public RecommendationDTO(long reco_id, Individual i_id, Company com_cr, Education edu_id, String reco_from,
			Timestamp reco_date, String reco_addby, String reco_attach, String reco_institute_name) {
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
}
