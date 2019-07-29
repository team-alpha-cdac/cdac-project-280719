package com.cdac.project.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="db_batches")
public class Batches {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int batch_id;
	   

		private int course_id;
		
		private String batch_name;
		
		@DateTimeFormat(iso=ISO.DATE)
		private java.util.Date batch_start_date;
		
		@DateTimeFormat(iso=ISO.DATE)
		private java.util.Date batch_end_date;
		
		private java.util.Date created_timestamp;
		private java.util.Date updated_timestamp;
		
		

		public int getBatch_id() {
			return batch_id;
		}

		public void setBatch_id(int batch_id) {
			this.batch_id = batch_id;
		}

		public int getCourse_id(){
			return course_id;
		}

		public void setCourse_id(int course_id){
			this.course_id=course_id;
		}

		public String getBatch_name(){
			return batch_name;
		}

		public void setBatch_name(String batch_name){
			this.batch_name=batch_name;
		}

		public java.util.Date getBatch_start_date(){
			return batch_start_date;
		}

		public void setBatch_start_date(java.util.Date batch_start_date){
			this.batch_start_date=batch_start_date;
		}

		public java.util.Date getBatch_end_date(){
			return batch_end_date;
		}

		public void setBatch_end_date(java.util.Date batch_end_date){
			this.batch_end_date=batch_end_date;
		}

		public java.util.Date getCreated_timestamp(){
			return created_timestamp;
		}

		public void setCreated_timestamp(java.util.Date created_timestamp){
			this.created_timestamp=created_timestamp;
		}

		public java.util.Date getUpdated_timestamp(){
			return updated_timestamp;
		}

		public void setUpdated_timestamp(java.util.Date updated_timestamp){
			this.updated_timestamp=updated_timestamp;
		}
	
		@Override
		public String toString() {
			return "AddBatch [course_id=" + course_id + ", batch_name=" + batch_name + ", batch_start_date="
					+ batch_start_date + ", batch_end_date=" + batch_end_date + ", created_timestamp="
					+ created_timestamp + ", updated_timestamp=" + updated_timestamp + "]";
		}
	
}
