package com.example.FirstApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.FirstApp.DTO.EducationDTO;
import com.example.FirstApp.ExceptionHandler.NotFoundException;
import com.example.FirstApp.mapperImp.EducationMapperImp;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.repository.EducationRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class EducationService {

	private EducationRepository educationRepository;

	private static final EducationMapperImp educationMapperImp = new EducationMapperImp();


	public ResponseEntity<Education> createEducationDTO(EducationDTO educationDTO) {

		Education education = Education.builder()
				.u_email(educationDTO.getU_email())
				.u_phone(educationDTO.getU_phone())
				.u_address(educationDTO.getU_address())
				.u_password(educationDTO.getU_password())
				.edu_id(educationDTO.getEdu_id())
				.edu_institute_name(educationDTO.getEdu_institute_name())
				.build();

		Education saveEducation = educationRepository.save(education);
		 educationMapperImp.educationToDTO(saveEducation);
		return new ResponseEntity<>(saveEducation, HttpStatus.CREATED);


	}
	
	public  ResponseEntity<List<Education>> getEducationList() {
		List<Education> educ = new ArrayList<Education>();
		educationRepository.findAll().forEach(educ::add);
		return new ResponseEntity<>(educ, HttpStatus.OK);
	}
	
	
	public EducationDTO getById(String edu_id) {
		try {
			return educationRepository.findById(edu_id)
					.map(educationMapperImp::educationToDTO).get();
		}catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", edu_id));
		}
	}
	
	
public EducationDTO updateEduPhone(String edu_id, String u_phone){
		try {
	educationRepository.updatePhoneNumber(edu_id, u_phone);
	return educationRepository.findById(edu_id)
			 .map(educationMapperImp::educationToDTO).get();
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in the database", edu_id));
		}	
				
	}

}
