package countryName;
import java.util.Scanner;

public class Palendrome {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn =new Scanner(System.in);
			int n;
			System.out.println("enter a no.");
			n=scn.nextInt();
			int m=n,rem=0,rev=0;
			while(n!=0) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
				
			}
			System.out.println("rev="+rev);
			if(m==rev)
				System.out.println("No is palendrome");
			else
				System.out.println("not palendrome");
			

		}

}


