package com.cdac.project.faculty.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.InputStreamResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
public class FileDownloadController {

	@RequestMapping(value = "/api/downloadResume/{username}", method = RequestMethod.GET)
	public InputStreamResource FileSystemResource (@PathVariable String username,HttpServletResponse response) throws IOException {
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=\""+username+".pdf\"");
		InputStreamResource resource = new InputStreamResource(new FileInputStream("/home/suraj/file_upload/"+username+".pdf"));
		return resource;
	}

}