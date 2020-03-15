package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.FirstApp.DTO.CompanyDTO;
import com.example.FirstApp.mapper.CompayMapper;
import com.example.FirstApp.model.Company;



public class CompanyMapperImp implements CompayMapper {
	
	  private ModelMapper modelMapper;

	  public CompanyMapperImp() {
		  modelMapper = new ModelMapper();
	  }
	  

		@Override
		public Company dtoToCompany(CompanyDTO companyDTO) {
		
			return  modelMapper.map(companyDTO, Company.class);
		}

		@Override
		public CompanyDTO companyToDTO(Company company) {

			return modelMapper.map(company, CompanyDTO.class);
		}

}
