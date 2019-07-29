package com.cdac.project.faculty.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cdac.project.faculty.model.Applicant;


@Repository
public class ApplicantDaoImpl implements ApplicantDao{

	@PersistenceContext
    private EntityManager entityManager;
	
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Applicant addApplicant(Applicant applicant) {
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session = this.sessionFactory.openSession();
		session.save(applicant);
		return applicant;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Applicant> listApplicants() {
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session= this.sessionFactory.openSession();
		return session.createQuery("from Applicant").list();
	}

	@Override
	@Transactional
	public Integer applicantCount() {
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session= this.sessionFactory.openSession();
		Integer count = ((Long)session.createQuery("select count(*) from Applicant").uniqueResult()).intValue();
		return count;
	}


	
}
