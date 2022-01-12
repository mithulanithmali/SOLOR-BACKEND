package com.erp.solar.repository.lead.sites;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.newbusiness.lead.LeadSite;

@Repository
public interface LeadSiteRepository extends JpaRepository<LeadSite, Integer>{

}
