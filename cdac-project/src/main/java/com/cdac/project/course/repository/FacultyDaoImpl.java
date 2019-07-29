package com.cdac.project.course.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cdac.project.course.model.Faculty;

@Repository
public class FacultyDaoImpl implements FacultyDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Faculty addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session = this.sessionFactory.openSession();
		session.save(faculty);
		System.out.println("success");
		return faculty;
	}
	
}
