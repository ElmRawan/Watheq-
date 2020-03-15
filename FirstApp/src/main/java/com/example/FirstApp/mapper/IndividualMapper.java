package com.example.FirstApp.mapper;


import com.example.FirstApp.DTO.IndividualDTO;

import com.example.FirstApp.model.Individual;

public interface IndividualMapper {
	
	Individual dtoToIndividual (final IndividualDTO individualDTO);
	IndividualDTO individualToDTO(final Individual individual);

}
