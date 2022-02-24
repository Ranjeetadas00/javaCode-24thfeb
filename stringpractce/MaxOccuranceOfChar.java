package stringpractce;

import java.util.Scanner;

public class MaxOccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c=0;
		
		System.out.println("enter a string");
		String mssg= scn.nextLine();
		char max=mssg.charAt(0);
//		char[] ch= new char[mssg.length()];
		for(int j=0;j<mssg.length();j++) {
			for(int k=1;k<mssg.length();k++) {
				if(mssg.charAt(j)==mssg.charAt(k))
					c++;
			}
		}
		System.out.println("Max occured character is" +c);
		
		

	}

}
