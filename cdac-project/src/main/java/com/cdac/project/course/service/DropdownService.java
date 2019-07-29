package com.cdac.project.course.service;

import java.util.List;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.model.DocTypes;

public interface DropdownService {
	public List<Batches> getBatchList();
	public List<DocTypes> getDocTypeList();
	

}
