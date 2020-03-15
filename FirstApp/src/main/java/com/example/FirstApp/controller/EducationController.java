package com.example.FirstApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FirstApp.DTO.EducationDTO;
import com.example.FirstApp.model.Education;
import com.example.FirstApp.service.EducationService;


@RestController
@CrossOrigin
//@RequestMapping("/api")
public class EducationController {

	//	@Autowired
	//	EducationRepository Edurepository;
	@Autowired
	EducationService educationService;


	EducationDTO educationDTO = new EducationDTO("Imamu@Email","0504278017","Riyadh","Imam123456","20001","ImamU");

	@RequestMapping("/Edu_create")
	public String createProcess() {

		educationService.createEducationDTO(educationDTO);

		return "Education Create Done";
	}



	@RequestMapping("/Edu_Find")

	public String FindbyCR() throws Exception{

		educationService.getById("20001");

		return "Education is Found";
	}



	@RequestMapping("/updateEduPhone")

	public String updateCompany() throws Exception{

		educationService.updateEduPhone("20001", "0512345222");
		return	"Education phone number updated";
	}

	@PostMapping(value="/Edu_save")
	public ResponseEntity<Education> save(@RequestBody EducationDTO educationDTO){
		return educationService.createEducationDTO(educationDTO); 
	}



	@GetMapping("/Education")
	public ResponseEntity<List<Education>> getEducations() {
		return educationService.getEducationList();
	}

}

//	@RequestMapping("/Edu_save")
//	public String process() {
//		//repository.deleteAll();
//		Edurepository.save(new Education ("Imamu@Email","055555","Riyadh","Imam123456","20001","ImamU"));
//
//		return "Education Done";
//
//	}


