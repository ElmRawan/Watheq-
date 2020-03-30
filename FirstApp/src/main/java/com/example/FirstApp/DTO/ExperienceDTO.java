package com.example.FirstApp.DTO;
import java.util.Date;
import com.example.FirstApp.model.Company;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExperienceDTO {
	
     private Individual i_id;
  
     private Company com_cr;
	  
     private Education edu_id;
     
     private long exp_id;
	  
     private String exp_position;

     private String com_name;

     private Date s_date;

     private Date e_date;

     private String exp_addby;

     private String ref_name;

     private String ref_email;
     
     
     
     
     
     public ExperienceDTO() {
		super();
	}
     
     
     


	public ExperienceDTO(Individual i_id, Company com_cr, Education edu_id, long exp_id, String exp_position,
			String com_name, Date s_date, Date e_date, String exp_addby, String ref_name, String ref_email) {
		super();
		this.i_id = i_id;
		this.com_cr = com_cr;
		this.edu_id = edu_id;
		this.exp_id = exp_id;
		this.exp_position = exp_position;
		this.com_name = com_name;
		this.s_date = s_date;
		this.e_date = e_date;
		this.exp_addby = exp_addby;
		this.ref_name = ref_name;
		this.ref_email = ref_email;
	}


}
