import { CompanyFormComponent } from './company-form/company-form.component';
import { CompanyListComponent } from './company-list/company-list.component';
import { EducationFormComponent } from './education-form/education-form.component';
import { EducationListComponent } from './education-list/education-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {path: '', component: EducationListComponent},
  {path: 'Education', component: EducationListComponent},
  {path: 'Edu_save' , component: EducationFormComponent},
  {path: '', component: CompanyListComponent},
  {path: 'Company', component: CompanyListComponent},
  {path: 'Com_save' , component: CompanyFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
