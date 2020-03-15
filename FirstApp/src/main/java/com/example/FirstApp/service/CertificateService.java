package com.example.FirstApp.service;

import org.springframework.stereotype.Service;

import com.example.FirstApp.DTO.CertificateDTO;
import com.example.FirstApp.mapperImp.CertificateMapperImp;
import com.example.FirstApp.model.Certificate;
import com.example.FirstApp.repository.CertificateRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class CertificateService {
	

	private CertificateRepository certificateRepository;
	private static final CertificateMapperImp certificateMapperImp = new CertificateMapperImp();
	
public CertificateDTO createCertificateDTO(CertificateDTO certificateDTO) {
		
	Certificate certificate = Certificate.builder()
				.i_id(certificateDTO.getI_id())
                .edu_id(certificateDTO.getEdu_id())
                .cert_id(certificateDTO.getCert_id())
                .cert_degree(certificateDTO.getCert_degree())
                .uni_name(certificateDTO.getUni_name())
                .cert_date(certificateDTO.getCert_date())
                .cert_addby(certificateDTO.getCert_addby())
                .cert_major(certificateDTO.getCert_major())
                .cert_gpa(certificateDTO.getCert_gpa())
                .cert_attach(certificateDTO.getCert_attach())
                .build();
		
		Certificate saveCertificate = certificateRepository.save(certificate);
        return certificateMapperImp.certificateToDTO(saveCertificate);
        
    }

}
