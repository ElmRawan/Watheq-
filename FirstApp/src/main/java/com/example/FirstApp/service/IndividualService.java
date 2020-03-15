package com.example.FirstApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.FirstApp.DTO.IndividualDTO;
import com.example.FirstApp.ExceptionHandler.NotFoundException;
import com.example.FirstApp.mapperImp.IndividualMapperImp;
import com.example.FirstApp.model.Individual;
import com.example.FirstApp.repository.IndividualRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor


public class IndividualService {
	
	private IndividualRepository individualRepository;
	private static final IndividualMapperImp individualMapperImp = new IndividualMapperImp();
	
	public ResponseEntity<Individual>  createIndividualDTO(IndividualDTO individualDTO) {
		
		Individual individual = Individual.builder()
				.u_email(individualDTO.getU_email())
                .u_phone(individualDTO.getU_phone())
                .u_address(individualDTO.getU_address())
                .u_password(individualDTO.getU_password())
                .i_id(individualDTO.getI_id())
                .fName(individualDTO.getFName())
                .lName(individualDTO.getLName())
                .gender(individualDTO.getGender())
                .married(individualDTO.getMarried())
                .dob(individualDTO.getDob())
                .major(individualDTO.getMajor())
                .job(individualDTO.getJob())
                .age(individualDTO.getAge())
                .cv_attach(individualDTO.getCv_attach())
                .build();
		
		Individual saveIndividual = individualRepository.save(individual);
         individualMapperImp.individualToDTO(saveIndividual);
         return  new ResponseEntity<>(saveIndividual, HttpStatus.CREATED);
        
    }
	
	public ResponseEntity<List<Individual>> getIndividualList() {
		List<Individual> indiv = new ArrayList<Individual>();
		individualRepository.findAll().forEach(indiv::add);
		return new ResponseEntity<>(indiv, HttpStatus.OK);
		
	}
	
	
	 public IndividualDTO getById(String id) {
	        try {
	            return individualRepository.findById(id)
	            .map(individualMapperImp::individualToDTO).get();
	        }catch (NoSuchElementException ex) {
	            throw new NotFoundException(String.format("No Record with the id [%s] was found in the database", id));
	        }
	    }
	 
	 public IndividualDTO updateIndPhone(String id, String u_phone){
			try {
				individualRepository.updatePhoneNumber(id, u_phone);
		return individualRepository.findById(id)
				 .map(individualMapperImp::individualToDTO).get();
			}
			catch (NoSuchElementException ex) {
				throw new NotFoundException(String.format("No Record with the id [%s] was found in the database", id));
			}	
					
		}

	

}
