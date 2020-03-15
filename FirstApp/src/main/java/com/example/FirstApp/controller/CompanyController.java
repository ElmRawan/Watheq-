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
import com.example.FirstApp.DTO.CompanyDTO;
import com.example.FirstApp.model.Company;
import com.example.FirstApp.service.CompanyService;

@RestController
@CrossOrigin
public class CompanyController {

	//	@Autowired
	//	CompanyRepository Comrepository;
	@Autowired
	CompanyService companyService;




	CompanyDTO companyDTO = new CompanyDTO("Tadawl@Email","0537444555","Riyadh","Tadawl123456","10002","Tadawl Company",Timestamp.valueOf("2018-03-17 00:00:00.123456789"),Timestamp.valueOf("2020-03-17 00:00:00.123456789"));

	@RequestMapping("/Com_create")
	public String createProcess() {

		companyService.createCompanyDTO(companyDTO);

		return "Company Create Done";
	}



	@RequestMapping("/Com_Find")

	public String FindbyCR() throws Exception{

		companyService.getById("10001");

		return "Company is Found";
	}



	@RequestMapping("/updateComPhone")

	public String updateCompany() throws Exception{

		companyService.updateComPhone("10002", "0512345111");
		return	"Company phone number updated";
	}

	@PostMapping(value="/Com_save")
	public ResponseEntity<Company> save(@RequestBody CompanyDTO companyDTO){
		return companyService.createCompanyDTO(companyDTO); 
	}



	@GetMapping("/Company")
	public ResponseEntity<List<Company>> getCompanies() {
		return companyService.getCompanyList();
	}


}
//	@RequestMapping("/Com_save")
//	public String process() {
//		//comrepository.deleteAll();
//		Comrepository.save(new Company ("Elm@Email","0537444156","Riyadh","Elm123456","10001","Elm Company",Timestamp.valueOf("2018-03-17 00:00:00.123456789"),Timestamp.valueOf("2020-03-17 00:00:00.123456789")));
//
//		return "Company Done";

//	}


