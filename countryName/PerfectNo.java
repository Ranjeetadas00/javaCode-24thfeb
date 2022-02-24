package countryName;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int n=scn.nextInt();
		
			for(int i=1;i<=n/2;i++) {
				if(n%i==0)
					sum=sum+i;
				
			}
			
		
		if(sum==n) {
			System.out.println(n+" is a perfect no.");
			
		}
		else
			System.out.println(n+ " is not a perfect no.");

	}

}
