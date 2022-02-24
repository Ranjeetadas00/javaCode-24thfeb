package arraypractce;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[] {1,2,3,4,4,5,6,8,3};
		int count=0,temp=0;
		for(int k=0;k<a.length;k++) {
			int key=a[k];
			for(int j=0;j<a.length;j++) {
				if(a[j]==a[k])
					count++;
				temp=a[j];
			}
			if(count>1)
				System.out.println(temp+" is dupilcate element");
			else
				System.out.println("no duplcates");
			
	
		}
		
	}

}
