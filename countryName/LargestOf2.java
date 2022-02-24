package countryName;

import java.util.Scanner;

public class LargestOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=scn.nextInt();
		b=scn.nextInt();
		System.out.println("The greatest of "+a+ " and " +b+ " is" +(a>b?a:b));
	}

}
