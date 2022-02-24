package arraypractce;

import java.util.Scanner;

public class Merging2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[4];
		int [] b= new int[2];
		int [] c= new int[6];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter frst array");
		for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
//		System.out.println(a);
		System.out.println("enter 2nd array");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();	
		}
	
		
//		for(int i=0;i<=c.length;i++) {
			c[i]=new int[a+b];
//		}
		
		

	}
}
