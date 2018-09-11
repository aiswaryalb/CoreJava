import java.util.*;
import java.io.*;
class SumArray
{
	public static void main(String[] args) {
		
	
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter  array");
		for (int i=0;i<size;i++ ) {
			arr[i]=sc.nextInt();
			
		}
		for (int j=0;j<size ;j++ ) {
			sum=sum+arr[j];
			
		}
		System.out.println("Sum of array elements is "+sum);
}
}
