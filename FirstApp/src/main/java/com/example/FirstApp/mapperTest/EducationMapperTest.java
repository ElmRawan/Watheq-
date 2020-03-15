package com.example.FirstApp.mapperTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.example.FirstApp.DTO.EducationDTO;
import com.example.FirstApp.mapperImp.EducationMapperImp;
import com.example.FirstApp.model.Education;

public class EducationMapperTest {
	
	

	private static final EducationMapperImp educationMapper = new EducationMapperImp();


	@Test
	public void educationMapper_educationToDTO() {
		final EducationDTO source =new EducationDTO();
		
		source.setEdu_id("EduIdT");
		source.setEdu_institute_name("EduNameT");

		

		final Education target = educationMapper.dtoToEducation(source);

		Assert.assertNotNull(target);
		
		Assert.assertEquals("EduIdT", target.getEdu_id());
		Assert.assertEquals("EduNameT", target.getEdu_institute_name());




	}


	@Test
	public void educationMapper_dtoToEducation() {
		final Education source =new Education();
		source.setEdu_id("EduIdT");
		source.setEdu_institute_name("EduNameT");

		

		final EducationDTO target = educationMapper.educationToDTO(source);

		Assert.assertNotNull(target);
		
		Assert.assertEquals("EduIdT", target.getEdu_id());
		Assert.assertEquals("EduNameT", target.getEdu_institute_name());


	}



}

