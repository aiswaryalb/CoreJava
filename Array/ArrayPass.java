import java.util.*;
import java.io.*;
class ArrayPass
{
	static void findMin( int arr[])
	{
		int min=arr[0];
		for (int i=0;i<arr.length ;i++ ) {
			
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("\n The smallest number is "+min);

	}
	public static void main(String[] args) {
		int arr[]=new int[3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 elements of array");
		for (int i=0;i<3 ;i++ ) {
			arr[i]=in.nextInt();
		}
		System.out.println("Array elements are : ");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"  ");
		}
		findMin(arr);
		

	}
}