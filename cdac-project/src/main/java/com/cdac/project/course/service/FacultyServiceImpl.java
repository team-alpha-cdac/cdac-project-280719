package com.cdac.project.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.course.model.Faculty;
import com.cdac.project.course.repository.FacultyDao;

@Service
public class FacultyServiceImpl {

	@Autowired
	private FacultyDao facultyDao;
	
	public Faculty addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDao.addFaculty(faculty);
	}
	
}
