package com.cdac.project.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.model.DocTypes;
import com.cdac.project.course.repository.DropdownDaoImpl;

@Service
public class DropdownServiceImpl implements DropdownService {
    @Autowired
	private  DropdownDaoImpl dropDown; 
	
	@Override
	public List<Batches> getBatchList() {
		// TODO Auto-generated method stub
		return dropDown.getBatchList();
	}

	@Override
	public List<DocTypes> getDocTypeList() {
		// TODO Auto-generated method stub
		return dropDown.getDocTypeList();
	}

}
