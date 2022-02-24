package stringpractce;

import java.util.Scanner;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c=0;
		System.out.println("enteer the string");
		String mssg= scn.nextLine();
		for(int j=0;j<mssg.length();j++) {
			for(int k=0;k<mssg.length();k++) {
				if(mssg.charAt(j)==mssg.charAt(k))
					System.out.println("Duplicate char is " +mssg.charAt(j));
			}
		}

	}

}
