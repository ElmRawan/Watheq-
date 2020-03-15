import { EducationServiceService } from './../education-service.service';
import { Component, OnInit } from '@angular/core';
import { Education } from '../education';

@Component({
  selector: 'app-education-list',
  templateUrl: './education-list.component.html',
  styleUrls: ['./education-list.component.css']
})
export class EducationListComponent implements OnInit {
 educations: Education[];
  constructor( private eduService: EducationServiceService) { }

  ngOnInit(){
    this.eduService.findAll().subscribe(data => {
      this.educations = data;
    });
  }

}
