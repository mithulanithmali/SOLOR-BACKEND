package com.erp.solar.service.attachment;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.erp.solar.model.attachment.File;
import com.erp.solar.repository.attachment.FileRepository;

@Service
public class FileServiceImpl implements FileService{
	
	@Autowired
	private FileRepository fileRepository;

	@Override
	public File storeFile(MultipartFile file, File fileData) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		File fileDB = new File();
		fileDB.setName(fileName);
//		fileDB.setType(file.getContentType());
		fileDB.setData(file.getBytes());
		fileDB.setDocument_title(fileData.getDocument_title());
		fileDB.setDocument_type(fileData.getDocument_type());
		fileDB.setReference(fileData.getReference());
		fileDB.setCreated_by(fileData.getCreated_by());
		fileDB.setRemarks(fileData.getRemarks());
		fileDB.setFile_size(file.getBytes().length);
		fileDB.setNewBusinessLead(fileData.getNewBusinessLead());
		return fileRepository.save(fileDB);
	}

	@Override
	public Stream<File> getAllFiles() {
		// TODO Auto-generated method stub
		return fileRepository.findAll().stream();
	}

	@Override
	public File getFile(String id) {
		// TODO Auto-generated method stub
		return fileRepository.findById(id).get();
	}

	

}
