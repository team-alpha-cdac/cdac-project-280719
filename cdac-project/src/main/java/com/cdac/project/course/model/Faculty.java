package com.cdac.project.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="db_faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int faculty_id;
	
	private int applicant_id;
	
	private short is_internal;
	private String full_name;
	private String email;
	private String password;
	private String mobile;
	private String address;
	private String skills;
	private String dob;
	private String remarks;
	private java.util.Date created_timestamp;
	private java.util.Date updated_timestamp;

	public int getApplicant_id(){
		return applicant_id;
	}

	public void setApplicant_id(int applicant_id){
		this.applicant_id=applicant_id;
	}

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public short getIs_internal() {
		return is_internal;
	}

	public void setIs_internal(short is_internal) {
		this.is_internal = is_internal;
	}

	public String getFull_name(){
		return full_name;
	}

	public void setFull_name(String full_name){
		this.full_name=full_name;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getMobile(){
		return mobile;
	}

	public void setMobile(String mobile){
		this.mobile=mobile;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public String getSkills(){
		return skills;
	}

	public void setSkills(String skills){
		this.skills=skills;
	}

	public String getDob(){
		return dob;
	}

	public void setDob(String dob){
		this.dob=dob;
	}

	public String getRemarks(){
		return remarks;
	}

	public void setRemarks(String remarks){
		this.remarks=remarks;
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
		return "FacultyModel [applicant_id=" + applicant_id + ", full_name=" + full_name + ", email=" + email
				+ ", password=" + password + ", mobile=" + mobile + ", address=" + address + ", skills=" + skills
				+ ", dob=" + dob + ", remarks=" + remarks + ", created_timestamp=" + created_timestamp
				+ ", updated_timestamp=" + updated_timestamp + "]";
	}
	
	
}
