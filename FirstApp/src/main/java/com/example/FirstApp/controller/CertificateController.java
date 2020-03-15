
package com.example.FirstApp.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstApp.DTO.CertificateDTO;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.model.Individual;
import com.example.FirstApp.service.CertificateService;




@RestController
@CrossOrigin
public class CertificateController {

	@Autowired 
	CertificateService certificateService;
	Individual individual = new Individual("1090019676");
	Education education = new Education("10102222442");
	CertificateDTO cert=new CertificateDTO(individual,education,"555522222", "Master","ImamU",
			Timestamp.valueOf("2018-01-17 00:00:00.123456789"),"12222201211","222222222IS",4.50,"URL222222");
	

	@RequestMapping("/Cert_create")
	public String process() {
		//Certrepository.deleteAll();
		//Certrepository.save(new Certificate ("5005","Master","ImamU",null,"1001","IS",4.50,"URL"));
		certificateService.createCertificateDTO(cert);
		return "Certificate Done";

	}
}
