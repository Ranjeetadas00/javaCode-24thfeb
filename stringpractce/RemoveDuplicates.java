package stringpractce;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int c=0;
		String s="";
		System.out.println("enter the string");
		String mssg= scn.nextLine();
		for(int j=0;j<mssg.length();j++) {
			for(int k=0;k<mssg.length();k++) {
				System.out.println(mssg);
//				if(mssg.charAt(j)==mssg.charAt(k))
//					System.out.println("string wthout duplcate =" +mssg.replace(j));
			}
		}
	}

}
