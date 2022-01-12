package com.erp.solar.service.attachment;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.erp.solar.model.attachment.File;

public interface FileService {
	public File storeFile(MultipartFile file, File fileData) throws IOException;
	public Stream<File> getAllFiles();
	public File getFile(String id);
}
