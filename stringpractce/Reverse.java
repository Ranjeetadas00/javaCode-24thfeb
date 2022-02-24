package stringpractce;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the string");
		String mssg= scn.nextLine();
		for (int j=mssg.length()-1;j>=0;j--)
		{
			System.out.print(mssg.charAt(j));
		}
	}

}
