package com.cdac.project.course.repository;

import java.util.List;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.model.DocTypes;

public interface DropdownDao {

	public List<Batches> getBatchList();
	public List<DocTypes> getDocTypeList();
	
}
