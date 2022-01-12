package com.erp.solar.service.lead.sites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.newbusiness.lead.LeadSite;
import com.erp.solar.repository.lead.sites.LeadSiteRepository;

@Service
public class LeadSiteServiceImpl implements LeadSiteService{
	
	@Autowired
	private LeadSiteRepository leadSiteRepository;

	@Override
	public LeadSite updateSite(LeadSite leadSite) {
		// TODO Auto-generated method stub
		return leadSiteRepository.save(leadSite);
	}

}
