package com.example.FirstApp.service;

import org.springframework.stereotype.Service;

import com.example.FirstApp.DTO.ExperienceDTO;
import com.example.FirstApp.mapperImp.ExperienceMapperImp;
import com.example.FirstApp.model.Experience;
import com.example.FirstApp.repository.ExperienceRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class ExperienceService {
	
	private ExperienceRepository experienceRepository;
	private static final ExperienceMapperImp experienceMapperImp = new ExperienceMapperImp();
	
	public ExperienceDTO createExperienceDTO(ExperienceDTO experienceDTO) {
		
		Experience experience = Experience.builder()
				.i_id(experienceDTO.getI_id())
                .com_cr(experienceDTO.getCom_cr())
                .edu_id(experienceDTO.getEdu_id())
                .exp_position(experienceDTO.getExp_position())
                .com_name(experienceDTO.getCom_name())
                .s_date(experienceDTO.getS_date())
                .e_date(experienceDTO.getE_date())
                .exp_addby(experienceDTO.getExp_addby())
                .ref_name(experienceDTO.getRef_name())
                .ref_email(experienceDTO.getRef_email())
                
                .build();
		
		Experience saveExperience = experienceRepository.save(experience);
        return experienceMapperImp.experienceToDTO(saveExperience);
        
    }

}
