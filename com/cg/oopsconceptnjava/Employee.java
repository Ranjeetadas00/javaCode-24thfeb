package com.cg.oopsconceptnjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	int empId;
	String empName;
	String empEmail;
	int empMobNo;
	Date empDOB;
	Date empDOJ;
	Scanner scn = new Scanner(System.in);
	void readEmpDetails() throws ParseException {
		System.out.println("enter the Employee detals");
		System.out.println("Emter EmpId");
		empId=scn.nextInt();
		scn.nextLine();
		System.out.println("Emter EmpName");
		empName=scn.nextLine();
		System.out.println("Emter EmpEmail");
		scn.nextLine();
		empEmail=scn.nextLine();
		System.out.println("Emter Emp moble no.");
//		scn.nextLine();
		empMobNo=scn.nextInt();
		
		System.out.println("Emter Emp DOB in 'dd/mm/yyyy'");
		String dob= scn.nextLine();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		empDOB =sdf.parse(dob);
//		scn.nextLine();
		System.out.println("Emter Emp DOB in 'dd/mm/yyyy'");
		String doj=scn.nextLine();
		empDOJ =sdf.parse(doj);
		
	}
	void displayEmpDetals() {
		System.out.println("Entered the Employee data as...............");
		System.out.println("EmpId is " +empId);
		System.out.println("EmpName is " +empName);
		System.out.println("EmpEmail is " +empEmail);
		System.out.println("Emp moble no. is " +empMobNo);
		System.out.println("Emp DOB in 'dd/mm/yyyy' is "  +empDOB.getDate()+"/"
				+empDOB.getMonth()+"/"+empDOB.getYear());
		System.out.println("Emp empDOJ in 'dd/mm/yyyy' is "  +empDOJ.getDate()+"/"
				+empDOJ.getMonth()+"/"+empDOJ.getYear());
		
		
	}

}
