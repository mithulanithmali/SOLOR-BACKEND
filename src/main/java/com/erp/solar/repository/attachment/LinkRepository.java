package com.erp.solar.repository.attachment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.attachment.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Integer>{

}
