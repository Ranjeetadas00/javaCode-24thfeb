package stringpractce;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the email");
		String mssg= scn.next();
//		for(int j=0;j<mssg.length();j++) {
//			if(mssg.charAt(j)=='@')
//				System.out.println("contains @");
//		if(mssg.charAt(j)=='.')
//				System.out.println("contains .");
//		else
//				System.out.println("not a vald email");
//		}
		for(int j=0;j<mssg.length();j++) {
			for(int k=0;k<mssg.length();k++) {
				if(mssg.charAt(j)=='@'&&mssg.charAt(k)=='.')
					System.out.println("contains both @ and .");
				
			}
			
				System.out.println("not a vald email");
		}
		
	}

}
