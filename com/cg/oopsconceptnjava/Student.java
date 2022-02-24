package com.cg.oopsconceptnjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	int studentid;
	String studentName;
	Date stdDob;
	
	Scanner scn = new Scanner(System.in);
	void readDetals() throws ParseException {
		System.out.println("enter stuid");
		studentid=scn.nextInt();
		System.out.println("enter stuName");
		scn.next();
		studentName = scn.nextLine();
		System.out.println("enter date");
		String dob= scn.nextLine();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
		stdDob= sdf.parse(dob);
	}
	
	void displayDetails() {
		System.out.println("Entered student data is");
		System.out.println("Student id = " + studentid );
		System.out.println("Student name = " + studentName);
		System.out.println("Student dob = " + stdDob.getDate()+
				"/"+stdDob.getMonth()+"/"+stdDob.getYear());
	}

}
