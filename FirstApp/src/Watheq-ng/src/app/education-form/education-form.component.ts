import { EducationServiceService } from './../education-service.service';
import { Component, OnInit } from '@angular/core';
import { Education } from '../education';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-education-form',
  templateUrl: './education-form.component.html',
  styleUrls: ['./education-form.component.css']
})
export class EducationFormComponent implements OnInit {
  education: Education = new Education;
  submitted = false;
  constructor(private eduService:EducationServiceService) { }

  ngOnInit(): void {
  }
  newEducation(): void {

    this.submitted = false;
    this.education = new Education();
  }

  onSubmit(){
    this.save();
  }

  save(){
    this.eduService.save(this.education)
     .subscribe(
        data => {
         console.log(data);
         this.submitted = true;
        },
        error => console.log(error));
    this.education = new Education();
  }

}
