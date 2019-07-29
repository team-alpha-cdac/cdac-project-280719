package com.cdac.project.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.course.model.FacultyWorkflow;
import com.cdac.project.course.repository.FacultyWorkflowDao;

@Service
public class FacultyWorkflowServiceImpl implements FacultyWorkflowService {

	@Autowired
	private FacultyWorkflowDao facultyWorkflow;
	
	@Override
	public List<FacultyWorkflow> listData() {
		// TODO Auto-generated method stub
		return facultyWorkflow.listData();
	}

}
