package com.cdac.project.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="db_courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_id;
	private String course_name;
	private int status;
	
	public Courses() {
		
	}
	
	public Courses(int course_id, String course_name, int status) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.status = status;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Courses [course_id=" + course_id + ", course_name=" + course_name + ", status=" + status + "]";
	}
	

	
	
}