package arraypractce;

import java.util.Scanner;

public class EvenOddPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[] {1,2,3,4,4,5,6,8,3};
		
//		Scanner sc =new Scanner(System.in);
		int sum=0;
		for(int j=0;j<a.length;j+=2) {
			sum=sum+a[j];
		}
		System.out.println("sum of even ndex is"  + sum);
		
	}

}
