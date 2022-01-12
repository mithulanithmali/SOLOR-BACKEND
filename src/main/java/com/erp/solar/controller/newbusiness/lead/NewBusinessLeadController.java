package com.erp.solar.controller.newbusiness.lead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.newbusiness.lead.NewBusinessLead;
import com.erp.solar.service.newbusiness.lead.NewBusinessLeadService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("new-business/lead")
public class NewBusinessLeadController {
	
	@Autowired
	NewBusinessLeadService newBusinessLeadService;

	@PostMapping("/add-new-lead")
	public ResponseEntity<NewBusinessLead>addNewLead(@RequestBody NewBusinessLead newBusinessLead){
		System.out.println(newBusinessLead);
		NewBusinessLead new_Lead = newBusinessLeadService.addNewLead(newBusinessLead);
		return new ResponseEntity<NewBusinessLead>(new_Lead,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<NewBusinessLead>getLeadById(@PathVariable("id") Integer id){
		NewBusinessLead find_Lead = newBusinessLeadService.findLeadById(id);
		return new ResponseEntity<NewBusinessLead>(find_Lead, HttpStatus.OK);		
	}
	
	@PutMapping("/update-lead")
	public ResponseEntity<NewBusinessLead>updateLead(@RequestBody NewBusinessLead newBusinessLead){
		NewBusinessLead update_lead = newBusinessLeadService.updateLead(newBusinessLead);
		return new ResponseEntity<NewBusinessLead>(update_lead,HttpStatus.OK);
	}

}
