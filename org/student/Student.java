package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name : Mohan");
	}
	
	public void studentDept() {
		System.out.println("Student Dept. : Mechanical");
	}
	
	public void studentId() {
		System.out.println("Student Id : 17me001");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.department();
		student.studentName();
		student.studentDept();
		student.studentId();
		
	}
}
