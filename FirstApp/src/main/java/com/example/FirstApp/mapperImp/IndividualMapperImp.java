package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.FirstApp.DTO.IndividualDTO;
import com.example.FirstApp.mapper.IndividualMapper;
import com.example.FirstApp.model.Individual;



public class IndividualMapperImp implements IndividualMapper {
	
	 private ModelMapper modelMapper;
	 
	 public IndividualMapperImp() {
		 modelMapper = new ModelMapper();
	 }

	@Override
	public Individual dtoToIndividual(IndividualDTO individualDTO) {
		
		return modelMapper.map(individualDTO, Individual.class);
	}

	@Override
	public IndividualDTO individualToDTO(Individual individual) {
		
		return modelMapper.map(individual, IndividualDTO.class);
	}

}
