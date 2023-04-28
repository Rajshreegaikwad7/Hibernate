package com.example.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int S_id;
	private String s_name;
	private String college;
	@OneToMany(cascade=CascadeType.ALL)
	List<Course>courses;
	
	public List<Course> getCourses() {
		return courses;
	}
	

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	public Student() 
	{
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int s_id, String s_name, String college) {
		
		S_id = s_id;
		this.s_name = s_name;
		this.college = college;
	}


	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
}
