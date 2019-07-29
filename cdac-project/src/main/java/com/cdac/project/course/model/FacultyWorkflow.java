package com.cdac.project.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="db_faculty_workflow")
public class FacultyWorkflow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int faculty_workflow_id;
	
	private int batch_to_modules_id;
	private int module_id;
	private int faculty_id;
	private java.util.Date date;
	private String task_description;
	private java.util.Date created_timpstamp;
	private java.util.Date updated_timestamp;
	
	private int hours;

	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getFaculty_workflow_id() {
		return faculty_workflow_id;
	}

	public void setFaculty_workflow_id(int faculty_workflow_id) {
		this.faculty_workflow_id = faculty_workflow_id;
	}

	public int getBatch_to_modules_id(){
		return batch_to_modules_id;
	}

	public void setBatch_to_modules_id(int batch_to_modules_id){
		this.batch_to_modules_id=batch_to_modules_id;
	}

	public int getModule_id(){
		return module_id;
	}

	public void setModule_id(int module_id){
		this.module_id=module_id;
	}

	public int getFaculty_id(){
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id){
		this.faculty_id=faculty_id;
	}

	public java.util.Date getDate(){
		return date;
	}

	public void setDate(java.util.Date date){
		this.date=date;
	}

	public String getTask_description(){
		return task_description;
	}

	public void setTask_description(String task_description){
		this.task_description=task_description;
	}

	public java.util.Date getCreated_timpstamp(){
		return created_timpstamp;
	}

	public void setCreated_timpstamp(java.util.Date created_timpstamp){
		this.created_timpstamp=created_timpstamp;
	}

	public java.util.Date getUpdated_timestamp(){
		return updated_timestamp;
	}

	public void setUpdated_timestamp(java.util.Date updated_timestamp){
		this.updated_timestamp=updated_timestamp;
	}
	
}
