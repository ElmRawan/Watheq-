package com.example.FirstApp.mapper;

import com.example.FirstApp.DTO.CompanyDTO;

import com.example.FirstApp.model.Company;

public interface CompayMapper {
	
	Company dtoToCompany (final CompanyDTO companyDTO);
	CompanyDTO companyToDTO(final Company company);

}
