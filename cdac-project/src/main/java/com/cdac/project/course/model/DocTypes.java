package com.cdac.project.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="db_document_types")
public class DocTypes {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int document_type_id;

	private String document_name;
	
	private short status;
	
	

	public int getDocument_type_id() {
		return document_type_id;
	}

	public void setDocument_type_id(int document_type_id) {
		this.document_type_id = document_type_id;
	}

	public String getDocument_name(){
		return document_name;
	}

	public void setDocument_name(String document_name){
		this.document_name=document_name;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public DocTypes(int document_type_id, String document_name, short status) {
		super();
		this.document_type_id = document_type_id;
		this.document_name = document_name;
		this.status = status;
	}
	
	public DocTypes() {
		
	}
	
	
	
}
