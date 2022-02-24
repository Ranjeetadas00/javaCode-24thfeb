package countryName;
import java.util.Scanner;

public class StrongNo {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scn=new Scanner(System.in);
				int n=0,rem;
				int fact=1;
				System.out.println("enter a no.");
				n=scn.nextInt();
				int m=n,sum=0;
				while(n!=0) {
					 rem=n%10;
					 for(int i=1;i<=rem;i++)
					 {
						 fact=fact*i;
						 
					 }
					 sum=sum+fact;
					 n=n/10;
//					 System.out.println("fact="+fact);
					
					 
				}
				 
				 System.out.println("sum="+sum);
				if(m==sum)
					System.out.println(m+" is astrong number");
				else
					System.out.println(m+" is not a strong number");
				

			}


	}


