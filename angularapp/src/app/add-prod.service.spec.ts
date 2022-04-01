import { TestBed } from '@angular/core/testing';

import { AddProdService } from './add-prod.service';

describe('AddProdService', () => {
  let service: AddProdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddProdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
