import java.util.*;
import java.io.*;
class SearchArray
{
	public static void main(String[] args) {
		
	
	int search,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter  array");
		for (int i=0;i<size;i++ ) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter search element");
		search=sc.nextInt();
		for (int i=0;i<size ;i++ ) {
			if (arr[i]==search) {
				flag=1;
				break;
				
			}

			
		}
		if (flag==1) {
		System.out.println("Search element present ");	
		}
		else
		{
			System.out.println("Search element not present ");
		}
		
}
}
