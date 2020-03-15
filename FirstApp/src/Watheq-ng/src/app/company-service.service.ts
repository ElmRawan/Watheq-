import { Company } from './company';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CompanyServiceService {
  createCompany(company: Company){
    throw new Error("Method not implemented")
  }
  private CompanyUrl: string;
  constructor(private http: HttpClient) {
    this.CompanyUrl = 'http://localhost:8080';
  }
 
  public findAll(): Observable<Company[]> {
    return this.http.get<[Company]>(this.CompanyUrl+'/Company');
  }
 
  public save(company: Company) {
    return this.http.post<Company>(this.CompanyUrl +'/Com_save', company);
  }
}
