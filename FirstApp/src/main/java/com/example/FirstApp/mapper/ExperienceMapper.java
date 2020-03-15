package com.example.FirstApp.mapper;

import com.example.FirstApp.DTO.ExperienceDTO;
import com.example.FirstApp.model.Experience;

public interface ExperienceMapper {

	Experience dtoToExperience (final ExperienceDTO experienceDTO);
	ExperienceDTO experienceToDTO(final Experience experience);
}
