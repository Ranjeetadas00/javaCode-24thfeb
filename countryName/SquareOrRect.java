package countryName;

import java.util.Scanner;

public class SquareOrRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int l,b;
		System.out.println("enter two sides");
		l=scn.nextInt();
		b=scn.nextInt();
		if(l==b)
			System.out.println("it s a square");
		else
			System.out.println("it is a rectangle");

	}

}
