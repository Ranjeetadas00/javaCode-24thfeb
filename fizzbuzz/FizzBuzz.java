package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=scn.nextInt();
		if(n%3==0 && n%5==0)
			System.out.println("FzzBuzz");
		else if(n%3==0)
			System.out.println("Fizz");
		else if(n%5==0)
			System.out.println("Buzz");
		else
			System.out.println(n+" is yr input no.");
			
		

	}

}
