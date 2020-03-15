package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;
import com.example.FirstApp.DTO.ExperienceDTO;
import com.example.FirstApp.mapper.ExperienceMapper;
import com.example.FirstApp.model.Experience;

public class ExperienceMapperImp implements ExperienceMapper{
	 private ModelMapper modelMapper;
	  
	  public ExperienceMapperImp() {
		  modelMapper = new ModelMapper();
	  }
	
	@Override
	public Experience dtoToExperience(ExperienceDTO experienceDTO) {
		
		return modelMapper.map(experienceDTO, Experience.class);
	}

	@Override
	public ExperienceDTO experienceToDTO(Experience experience) {
		
		return modelMapper.map(experience, ExperienceDTO.class);
	}

}
