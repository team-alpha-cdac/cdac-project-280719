package com.cdac.project.course.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cdac.project.course.model.Batches;

@Repository
public class AddBatchDaoImpl implements AddBatchDao{

	@PersistenceContext
	private EntityManager entityManager;
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public Batches addBatch(Batches batches) {
		// TODO Auto-generated method stub
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session = this.sessionFactory.openSession();
		session.save(batches);
		System.out.println("success");
		return batches;
		
	
	}

	
}
