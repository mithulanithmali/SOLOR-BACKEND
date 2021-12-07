package com.erp.solar.service.marketing.lead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.marketing.lead.Lead;
import com.erp.solar.repository.marketing.lead.LeadRepository;

@Service
public class LeadAccountServiceImpl implements LeadAccountService{

	@Autowired
	private LeadRepository leadRepo;

	@Override
	public Lead addLeadAccountService(Lead leadAccount) {
		return leadRepo.save(leadAccount);
	}

}
