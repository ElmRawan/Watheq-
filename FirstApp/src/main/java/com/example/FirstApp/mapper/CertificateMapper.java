package com.example.FirstApp.mapper;

import com.example.FirstApp.DTO.CertificateDTO;
import com.example.FirstApp.model.Certificate;


public interface CertificateMapper {
	
	Certificate dtoToCertificate (final CertificateDTO certificateDTO);
	CertificateDTO certificateToDTO(final Certificate certificate);

}
