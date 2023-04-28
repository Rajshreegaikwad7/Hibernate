package com.example.Entity;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Courses")
public class Course {
	@Id
	
	private int C_id;
	private String C_name;
	
	
	public Course() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(int c_id, String c_name) {
		
		C_id = c_id;
		C_name = c_name;
	}


	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	
	

}
