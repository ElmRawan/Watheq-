package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.FirstApp.DTO.EducationDTO;
import com.example.FirstApp.mapper.EducationMapper;
import com.example.FirstApp.model.Education;

public class EducationMapperImp implements EducationMapper {
	
	  private ModelMapper modelMapper;
	  
	  public EducationMapperImp() {
		  modelMapper = new ModelMapper();
	  }


	@Override
	//Save in real DB
	public Education dtoToEducation(EducationDTO educationDTO) {
		
		return modelMapper.map(educationDTO, Education.class);
	}

	@Override
	public EducationDTO educationToDTO(Education education) {
		
		return modelMapper.map(education, EducationDTO.class);
	}



}
