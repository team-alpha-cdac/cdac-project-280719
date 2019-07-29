package com.cdac.project.course.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.model.DocTypes;

@Repository
public class DropdownDaoImpl implements DropdownDao{

	@PersistenceContext
    private EntityManager entityManager;
	
	private SessionFactory sessionFactory;
	
	@Override
	public List<Batches> getBatchList() {
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session= this.sessionFactory.openSession();
		return session.createQuery("from Batches").list();
	
	}

	@Override
	public List<DocTypes> getDocTypeList() {
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session= this.sessionFactory.openSession();
		return session.createQuery("from DocTypes").list();

	}

}
