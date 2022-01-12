package com.erp.solar.repository.lead.activities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.lead.activities.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer>{

}
