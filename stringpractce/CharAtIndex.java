package stringpractce;

import java.util.Scanner;


public class CharAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the string");
		String mssg= scn.next();
		for(int j=0;j<mssg.length();j++) {
			if(mssg.charAt(j)>=48&&mssg.charAt(j)<=57)
				System.out.println(mssg.charAt(j)+ " 7s a no.");
			else if((j>=65&&j<=91)||(j>=97&&j<=122))
				System.out.println("s a alphabet");
			else 
				System.out.println("special character");
		}

	}

}
