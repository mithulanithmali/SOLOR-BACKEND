package com.erp.solar.repository.marketing.lead;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.marketing.lead.Lead;


@Repository
public interface LeadRepository extends JpaRepository<Lead , Integer>{

}