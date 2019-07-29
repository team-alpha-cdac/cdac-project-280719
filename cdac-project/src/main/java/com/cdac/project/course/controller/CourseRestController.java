package com.cdac.project.course.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.model.Courses;
import com.cdac.project.course.model.DocTypes;
import com.cdac.project.course.service.CourseServiceImpl;
import com.cdac.project.course.service.DropdownServiceImpl;
import com.cdac.project.course.service.FacultyWorkflowServiceImpl;

@RestController
@Controller
public class CourseRestController {

	@Autowired
	private DropdownServiceImpl dropdown;

	@Autowired
	CourseServiceImpl courseService;

	@Autowired
	private FacultyWorkflowServiceImpl facultyWorkflowService;

	@GetMapping(path = "/faculty/get-batches-dd", produces = "application/json")
	public List<Batches> getBatchesDropdown() {
		return dropdown.getBatchList();
	}

	@GetMapping(path = "/faculty/get-docs-dd", produces = "application/json")
	public List<DocTypes> getDocsDropdown() {
		return dropdown.getDocTypeList();
	}

	@GetMapping(path = "/faculty/get-recordsheet-list", produces = "application/json")
	public HashMap getRecordSheet() {

		HashMap m = new HashMap();
		m.put("data", facultyWorkflowService.listData());

		return m;

	}

	@GetMapping(path = "/get-courses", produces = "application/json")
	public List<Courses> getCourses() {
		return courseService.getCourses();
	}

}
