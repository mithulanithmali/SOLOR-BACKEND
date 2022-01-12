package com.erp.solar.service.attachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.attachment.Link;
import com.erp.solar.repository.attachment.LinkRepository;

@Service
public class LinkServiceImpl implements LinkService{
	
	@Autowired
	LinkRepository linkRepository;

	@Override
	public Link newLink(Link link) {
		// TODO Auto-generated method stub
		return linkRepository.save(link);
	}

}
