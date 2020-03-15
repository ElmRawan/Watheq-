import { Education } from './education';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EducationServiceService {
  createEducation(education: Education){
    throw new Error("Method not implemented")
  }
  private EducationUrl: string;
  constructor(private http: HttpClient) {
    this.EducationUrl = 'http://localhost:8080';
  }
 
  public findAll(): Observable<Education[]> {
    return this.http.get<[Education]>(this.EducationUrl+'/Education');
  }
 
  public save(education: Education) {
    return this.http.post<Education>(this.EducationUrl +'/Edu_save', education);
  }
}
