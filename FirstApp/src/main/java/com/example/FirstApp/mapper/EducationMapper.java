package com.example.FirstApp.mapper;


import com.example.FirstApp.DTO.EducationDTO;
import com.example.FirstApp.model.Education;

public interface EducationMapper {

	Education dtoToEducation (final EducationDTO educationDTO);
	EducationDTO educationToDTO(final Education education);

}
