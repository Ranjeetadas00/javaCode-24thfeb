package countryName;
import java.util.Scanner;	
	public class Employee {
//		public String empRating(String rating) {
//			String rat=ratng;
//			if(rat=="Avg"||rat=="aboveAvg"||rat=="outstandng")
//				return "eligible for bonus";
//			else
//				return "not eligible";
//			
//			
//		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn= new Scanner(System.in);
			int years=0,count=0;
			double bonus=0;
			int sal=0;
			String rat="";
			String dpt="";
			System.out.println("enter no.of years");
			years=scn.nextInt();
		if(years>2)
		{	
			System.out.println("enter rating");
			rat=scn.nextLine();
			if(rat=="avg"||rat=="aboveAvg"||rat=="outstandng")
			{	
				System.out.println("eligible for bonus");
				System.out.println("enter salary");
				sal=scn.nextInt();
				System.out.println("enter dpt");
				dpt=scn.next();
				if(dpt=="hr")
					bonus=sal*0.02;
				if(dpt=="accountant")
					bonus=3*0.03;
				if(dpt=="it")
					bonus=sal*0.05;
				if(dpt=="sales")
					bonus=sal*0.08;
				System.out.println("bonus=+"+ bonus);
			}
			else 
				System.out.println("not eligible for bonus");
		}
		else {
			System.out.println("not eligible for bonus, some more years required");
		}
				
		}

	}

