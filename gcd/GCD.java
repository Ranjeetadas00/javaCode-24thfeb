package gcd;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int p,q,gcd=0;
		System.out.println("Enter 2 numbers");
		p=scn.nextInt();
		q=scn.nextInt();
		for(int i=1;i<=p&&i<=q;i++) {
			if(p%i==0&& q%i==0)
			gcd=i;	
		}
		System.out.println("GCD of " +p+" and "+q+ " is " +gcd);
	}

}
