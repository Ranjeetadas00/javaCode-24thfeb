package areaypractce2;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		String str= new String ("Hiiii at work learning java now and java is amazng");
		
		Scanner scn = new Scanner(System.in);
		
		int count=1;
		System.out.println("Enter the String");
		String str1 = scn.nextLine();
		System.out.println(str1.split(" "));
		String [] word=str1.split(" ");
		System.out.println(word);
		for (int j=0;j<str1.length();j++) {
			if(str1.charAt(j)==' ')
			count++;
			
		}
		System.out.println("No. of Words in string is = "+count);
		
		
		
	}

}
