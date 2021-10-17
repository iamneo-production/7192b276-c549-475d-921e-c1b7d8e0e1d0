import { TestBed } from '@angular/core/testing';

import { BankVaultService } from './bank-vault.service';

describe('BankVaultService', () => {
  let service: BankVaultService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BankVaultService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
