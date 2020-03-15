package com.example.FirstApp.controller;


import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FirstApp.DTO.IndividualDTO;
import com.example.FirstApp.model.Individual;
import com.example.FirstApp.service.IndividualService;


@RestController
@CrossOrigin
public class IndividualController {

	@Autowired 
	IndividualService individualService;
	//IndividualRepository Indrepository;

	IndividualDTO individualDTO = new IndividualDTO("RawanAl@Email.com","0537444155","Riyadh","RR122132","1090019686","Rawan","AbdulAziz",
			Timestamp.valueOf("1995-03-17 00:00:00.123456789"),"24",true,true,"Trainee","IS","URL");


	@RequestMapping("/Ind_create")
	public String createProcess() {

		individualService.createIndividualDTO(individualDTO);

		return "Individual Create Done";
	}


	@RequestMapping("/Ind_Find")

	public String FindbyID() throws Exception{

		individualService. getById("11");

		return "findCompanyy";

	}

	@PostMapping(value="/Ind_save")
	public ResponseEntity<Individual> save(@RequestBody IndividualDTO individualDTO){
		return individualService.createIndividualDTO(individualDTO); 
	}



	@GetMapping("/Individual")
	public ResponseEntity<List<Individual>> getIndividuals() {
		return individualService.getIndividualList();
	}


}
