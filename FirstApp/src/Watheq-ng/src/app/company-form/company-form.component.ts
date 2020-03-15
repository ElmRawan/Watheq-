import { Component, OnInit } from '@angular/core';
import { CompanyServiceService } from '../company-service.service';
import { Company } from '../company';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-company-form',
  templateUrl: './company-form.component.html',
  styleUrls: ['./company-form.component.css']
})
export class CompanyFormComponent implements OnInit {

  company: Company = new Company;
  submitted = false;
  constructor(private comService:CompanyServiceService) { }

  ngOnInit(): void {
  }
  newEducation(): void {

    this.submitted = false;
    this.company = new Company();
  }

  onSubmit(){
    this.save();
  }

  save(){
    this.comService.save(this.company)
     .subscribe(
        data => {
         console.log(data);
         this.submitted = true;
        },
        error => console.log(error));
    this.company = new Company();
  }

}
