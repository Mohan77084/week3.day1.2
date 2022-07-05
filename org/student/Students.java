package org.student;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Student's Id :"+ id);
}
public void getStudentInfo(int id , String name) {
	System.out.println("Student's Id :"+ id + ", Student's Name :" + name );
}
public void getStudentInfo(String email , long  phoneNumber) {
	System.out.println("Student's email :"+ email + ", Student's Phone No. :" + phoneNumber );
}
public static void main(String[] args) {
	Students info1 = new Students();
	info1.getStudentInfo(1245);
	info1.getStudentInfo(1245,"Priya");
	info1.getStudentInfo("priya@gmail.com", 9875463120L);
	
	Students info2 = new Students();
	info2.getStudentInfo(5421);
	info2.getStudentInfo(5421,"Rahul");
	info2.getStudentInfo("rahul@gmail.com", 9844527202L);
	
}
}
