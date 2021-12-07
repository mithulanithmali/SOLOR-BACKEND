package com.erp.solar.service.account.corporateaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.account.CorporateAccount;
import com.erp.solar.repository.account.CorporateAccountRepository;


@Service
public class CorporateAccountServiceImpl implements CorporateAccountService{

	@Autowired
	private CorporateAccountRepository corporateAccountRepo;
	@Override
	public CorporateAccount addCorporateAccountService(CorporateAccount corporateAccount) {
		
		return corporateAccountRepo.save(corporateAccount);
	}

	
}
