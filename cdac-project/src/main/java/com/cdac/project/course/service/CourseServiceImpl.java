package com.cdac.project.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.course.model.Courses;
import com.cdac.project.course.repository.CourseDaoImpl;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDaoImpl course;

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return course.getCourses();
	}
	
}
