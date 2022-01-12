package com.erp.solar.service.newbusiness.lead;

import com.erp.solar.model.newbusiness.lead.NewBusinessLead;

public interface NewBusinessLeadService {
	public NewBusinessLead addNewLead(NewBusinessLead newBusinessLead);
	public NewBusinessLead updateLead(NewBusinessLead newBusinessLead);
	public NewBusinessLead findLeadById (Integer id);
}
