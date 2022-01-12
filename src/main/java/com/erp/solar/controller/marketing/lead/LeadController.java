package com.erp.solar.controller.marketing.lead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erp.solar.model.marketing.lead.Lead;
import com.erp.solar.service.marketing.lead.LeadAccountService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("marketing/lead")
public class LeadController {
	@Autowired
	LeadAccountService leadAccountService;

	@PostMapping("/add")
	public Lead addPrivateAccount(@RequestBody Lead lead) {
		System.out.println("here");
		return leadAccountService.addLeadAccountService(lead);

	}
	
	@PutMapping("/update")
	public ResponseEntity<Lead>updateLead(@RequestBody Lead lead){
		Lead update_lead = leadAccountService.updateLead(lead);
		return new ResponseEntity<Lead>(update_lead,HttpStatus.OK);
	}

}
