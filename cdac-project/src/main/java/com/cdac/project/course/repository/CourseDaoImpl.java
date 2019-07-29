package com.cdac.project.course.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cdac.project.course.model.Courses;

@Repository
public class CourseDaoImpl implements CourseDao{

	@PersistenceContext
	private EntityManager entityManager;
	private SessionFactory sessionFactory;

	@Override
	public List<Courses> getCourses() {
		this.sessionFactory = this.entityManager.unwrap(Session.class).getSessionFactory();
		Session session = this.sessionFactory.openSession();
		List<Courses> courses = (List<Courses>) session.createQuery("from Courses").list();
		
		return courses;
		
		
	}
	
}
