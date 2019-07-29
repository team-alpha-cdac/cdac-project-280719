package com.cdac.project.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.repository.AddBatchDao;

@Service
public class AddBatchServiceImpl implements AddBatchService {

	@Autowired
	public  AddBatchDao addBatchDao;
	@Override
	public Batches addBatch(Batches addBatch) {
		// TODO Auto-generated method stub
		return addBatchDao.addBatch(addBatch);
	}
	
}
