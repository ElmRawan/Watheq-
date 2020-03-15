package com.example.FirstApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.FirstApp.DTO.CompanyDTO;
import com.example.FirstApp.ExceptionHandler.NotFoundException;
import com.example.FirstApp.mapperImp.CompanyMapperImp;
import com.example.FirstApp.model.Company;
import com.example.FirstApp.repository.CompanyRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class CompanyService {

	private CompanyRepository companyRepository;
	private static final CompanyMapperImp companyMapperImp = new CompanyMapperImp();


	public ResponseEntity<Company> createCompanyDTO(CompanyDTO companyDTO) {

		Company company = Company.builder()
				.u_email(companyDTO.getU_email())
				.u_phone(companyDTO.getU_phone())
				.u_address(companyDTO.getU_address())
				.u_password(companyDTO.getU_password())
				.com_cr(companyDTO.getCom_cr())
				.com_name(companyDTO.getCom_name())
				.s_date(companyDTO.getS_date())
				.e_date(companyDTO.getE_date())
				.build();

		Company saveCompany = companyRepository.save(company);
		companyMapperImp.companyToDTO(saveCompany);
		return new ResponseEntity<>(saveCompany, HttpStatus.CREATED);

	}
	

	public  ResponseEntity<List<Company>> getCompanyList() {
		List<Company> comp = new ArrayList<Company>();
		companyRepository.findAll().forEach(comp::add);
		return new ResponseEntity<>(comp, HttpStatus.OK);
	}

	
	public CompanyDTO getById(String ID) {
		try {
			return companyRepository.findById(ID)
					.map(companyMapperImp::companyToDTO).get();
		}catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", ID));
		}
	}

	public CompanyDTO updateComPhone(String id, String u_phone){
		try {
			companyRepository.updatePhoneNumber(id, u_phone);
			return companyRepository.findById(id)
					.map(companyMapperImp::companyToDTO).get();
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in the database", id));
		}	

	}

	


}
