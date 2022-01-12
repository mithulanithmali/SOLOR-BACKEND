package com.erp.solar.service.newbusiness.lead;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.exception.ResourceNotFoundException;
import com.erp.solar.model.newbusiness.lead.NewBusinessLead;
import com.erp.solar.repository.newbusiness.lead.NewBusinessLeadRepository;

@Service
@Transactional
public class NewBusinessLeadServiceImpl implements NewBusinessLeadService{
	
	@Autowired
	private NewBusinessLeadRepository newbusinessleadrepository;

	@Override
	public NewBusinessLead addNewLead(NewBusinessLead newBusinessLead) {			
		return newbusinessleadrepository.save(newBusinessLead);		
	}

	@Override
	public NewBusinessLead updateLead(NewBusinessLead newBusinessLead) {		
		return newbusinessleadrepository.save(newBusinessLead);
	}

//	@Transactional(rollbackOn = ResourceNotFoundException.class)

	@Override
	public NewBusinessLead findLeadById(Integer id) {
		// TODO Auto-generated method stub
		return newbusinessleadrepository.findLeadById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Lead by id " + id + " was not found"));
	}
}
