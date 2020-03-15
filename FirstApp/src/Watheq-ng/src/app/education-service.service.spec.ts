import { TestBed } from '@angular/core/testing';

import { EducationServiceService } from './education-service.service';

describe('EducationServiceService', () => {
  let service: EducationServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EducationServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
