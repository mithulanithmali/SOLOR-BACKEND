package com.erp.solar.controller.attachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.attachment.Link;
import com.erp.solar.service.attachment.LinkService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("attachment/link")
public class LinkController {
	
	@Autowired
	LinkService linkService;
	
	@PostMapping("/new-link")
	public ResponseEntity<Link>newLink(@RequestBody Link link){
		Link new_Link = linkService.newLink(link);
		return new ResponseEntity<Link>(new_Link,HttpStatus.CREATED);
		
	}

}
