package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.FirstApp.DTO.CertificateDTO;
import com.example.FirstApp.mapper.CertificateMapper;
import com.example.FirstApp.model.Certificate;


public class CertificateMapperImp implements CertificateMapper {
	
	 private ModelMapper modelMapper;
	  
	  public CertificateMapperImp() {
		  modelMapper = new ModelMapper();
	  }

	@Override
	public Certificate dtoToCertificate(CertificateDTO certificateDTO) {
		
		return modelMapper.map(certificateDTO, Certificate.class);
	}

	@Override
	public CertificateDTO certificateToDTO(Certificate certificate) {
		
		return modelMapper.map(certificate, CertificateDTO.class);
	}
	  
	  
	  

}
