package com.erp.solar.controller.attachment;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.erp.solar.model.attachment.File;
import com.erp.solar.model.attachment.ResponseMessage;
import com.erp.solar.service.attachment.FileService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("new-business/attachment")
public class FileController {
	
	@Autowired
	FileService fileService;
	
	@PostMapping("/upload")
	 public ResponseEntity<ResponseMessage> uploadFile(@RequestPart("file") MultipartFile file, @RequestPart("data") File fileData) {
	    String message = "";
	    try {
	    	fileService.storeFile(file, fileData); 
	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
	  }
	
	@GetMapping("/files")
	  public ResponseEntity<List<File>> getListFiles() {
	    List<File> files = fileService.getAllFiles().map(dbFile -> {
	      String fileDownloadUri = ServletUriComponentsBuilder
	          .fromCurrentContextPath()
	          .path("/new-business/attachment/files/")
	          .path(dbFile.getId())
	          .toUriString();
	      
	      return new File(
	    		  dbFile.getId(),
	    		  dbFile.getName(),   		  
	    		  dbFile.getCreated_on(),
	    		  dbFile.getCreated_by(),
	    		  dbFile.getDocument_title(),
	    		  dbFile.getDocument_type(),
	    		  dbFile.getReference(),
	    		  dbFile.getRemarks(),
	    		  fileDownloadUri,
	    		  dbFile.getFile_size(),
	    		  dbFile.getData());}).collect(Collectors.toList());

	    return ResponseEntity.status(HttpStatus.OK).body(files);
	  }
	
	 @GetMapping("/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
	    File fileDB = fileService.getFile(id);

	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
	        .body(fileDB.getData());
	  }
}
