package com.app.core;

public class Employee {
	private Integer empId;
	private String empName;
	private String course;
	
	
	public Employee(Integer empId, String empName, String course) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.course = course;
	}
	
	
	public boolean equals(Object obj) {
		Employee e= (Employee) obj;
		if(this.empId==e.empId && this.empName==e.empName && this.course==e.course)
		return true;
		return false;
	}
	
	
	public int hashCode() {
		return (this.empId.hashCode() + this.empName.hashCode()+this.course.hashCode());
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", course=" + course + "]";
	}
	
}
