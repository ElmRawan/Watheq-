package com.example.FirstApp.DTO;

import java.util.Date;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CertificateDTO {
	
    	private Individual i_id;
    	
    	private Education edu_id;
    	
		private String cert_id;

		private String cert_degree;

		private String uni_name;

		private Date cert_date;

		private String cert_addby;

		private String cert_major;

		private double cert_gpa;

		private String cert_attach;

		
		

		
		public CertificateDTO() {
			super();
		}
		
	

		public CertificateDTO(Individual i_id, Education edu_id, String cert_id, String cert_degree, String uni_name,
				Date cert_date, String cert_addby, String cert_major, double cert_gpa, String cert_attach) {
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


}
