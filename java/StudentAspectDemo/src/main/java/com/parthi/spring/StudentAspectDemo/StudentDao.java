package com.parthi.spring.StudentAspectDemo;

public class StudentDao
{
  String studentName;
  int rollNo;

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
  
@Override
public String toString() {
	return "StudentDao [studentName=" + studentName + ", rollNo=" + rollNo + "]";
}  
	
public void display()
{

	System.out.println("Student details :"+studentName+" "+rollNo);
}
}
