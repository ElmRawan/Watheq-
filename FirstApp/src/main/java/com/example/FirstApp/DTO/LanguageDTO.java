package com.example.FirstApp.DTO;

import java.util.Date;
import com.example.FirstApp.model.Individual;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class LanguageDTO {

	

	private Individual i_id;


	private String language_id;


	private String language_name;


	private String lang_cert_type;


	private Date language_date;


	private String language_institute_name;


	private String language_attach;
	
	


	public LanguageDTO() {
		super();
	}

	


	public LanguageDTO(Individual i_id, String language_id, String language_name, String lang_cert_type,
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

}
