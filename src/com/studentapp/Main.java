package com.studentapp;

public class Main {

	public static void main(String[] args) {
		System.out.println("************** Student Management System **************");
		System.out.println("************** Welcome **************");
		
		Student s1;
		s1= new Student("Nikhil Nark",23,"S-12");
		
		s1.enrollCourse("java");
		s1.enrollCourse("dsa");
		s1.enrollCourse("Devops");
		s1.enrollCourse("C#");
		//System.out.println(s1);
		s1.printStudentInfo();
		
		Student s2 = new Student("Nik",25,"S-11");
		s2.enrollCourse("Devops");
		s2.printStudentInfo();
		
		Student s3 = new Student("Sur",31,"S-14");
		s3.enrollCourse("DSA");
		s3.printStudentInfo();
		

	}

}
