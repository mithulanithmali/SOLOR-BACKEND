package com.erp.solar.repository.attachment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.attachment.File;

@Repository
public interface FileRepository extends JpaRepository<File, String>{

}
