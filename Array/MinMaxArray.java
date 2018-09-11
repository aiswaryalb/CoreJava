import java.util.*;
import java.io.*;
class MinMaxArray
{
	public static void main(String[] args) 
	{
		int min,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter  array");
		for (int i=0;i<size;i++ ) 
		{
			arr[i]=sc.nextInt();
			
		}
		min=arr[0];

		for (int i=1;i<size;i++ ) 
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
			
		}
		max=arr[0];

		for (int i=1;i<size;i++ ) 
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
			
		}
		System.out.println("Minimum value is "+min);
		System.out.println("Maximum value is "+max);



	}
}