package com.erp.solar.repository.lead.scoring;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.newbusiness.lead.Scoring;

@Repository
public interface ScoringRepository extends JpaRepository<Scoring, Integer>{

}
