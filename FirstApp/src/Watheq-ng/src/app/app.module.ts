

import { EducationServiceService } from './education-service.service';
import {platformBrowser} from "../../node_modules/@angular/platform-browser"
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EducationComponent } from './education/education.component';
import { EducationListComponent } from './education-list/education-list.component';
import { EducationFormComponent } from './education-form/education-form.component';
import { CompanyListComponent } from './company-list/company-list.component';
import { CompanyFormComponent } from './company-form/company-form.component';

@NgModule({
  declarations: [
    AppComponent,
    EducationComponent,
    EducationListComponent,
    EducationFormComponent,
    CompanyListComponent,
    CompanyFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,
    FormsModule


  ],
  providers: [EducationServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
