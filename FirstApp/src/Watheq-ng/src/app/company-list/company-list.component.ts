import { Component, OnInit } from '@angular/core';
import { CompanyServiceService } from '../company-service.service';
import { Company } from '../company';

@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {

  companies: Company[];
  constructor( private comService: CompanyServiceService) { }

  ngOnInit(){
    this.comService.findAll().subscribe(data => {
      this.companies = data;
    });
  }

}
