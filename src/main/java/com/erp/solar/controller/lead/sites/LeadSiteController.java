package com.erp.solar.controller.lead.sites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.newbusiness.lead.LeadSite;
import com.erp.solar.service.lead.sites.LeadSiteService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/site")
public class LeadSiteController {
	
	@Autowired
	LeadSiteService leadSiteService;
	
	@PutMapping("/update")
	public ResponseEntity<LeadSite>updateLead(@RequestBody LeadSite leadSite){
		LeadSite update_site = leadSiteService.updateSite(leadSite);
		return new ResponseEntity<LeadSite>(update_site,HttpStatus.OK);
	}

}
