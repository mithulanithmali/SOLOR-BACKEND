package com.erp.solar.repository.newbusiness.lead;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.newbusiness.lead.NewBusinessLead;

@Repository
public interface NewBusinessLeadRepository extends JpaRepository<NewBusinessLead, Integer> {
	Optional<NewBusinessLead> findLeadById(Integer id);

}
