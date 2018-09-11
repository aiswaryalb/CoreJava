import java.util.*;
import java.io.*;
class SortArray
{
	public static void main(String[] args) {
		
	
	int temp=0,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter  array");
		for ( i=0;i<size;i++ ) 
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("The unsorted array is ");
		for (j=0;j<size ;j++ ) 
		{
			System.out.print("\t"+arr[j]+"\t");
			
		}
		for (i=0;i<size ;i++ )
		 {
		 	for (j=i+1;j<size ;j++ ) 
		 	{
		 		if (arr[i]>arr[j])
		 	    {
		 	    	temp=arr[i];
		 	    	arr[i]=arr[j];
		 	    	arr[j]=temp;		 			
		 		}
		 		
		 	}
			
		}


		System.out.println("\n The sorted array is ");
		for (j=0;j<size ;j++ ) 
		{
			System.out.print("\t"+arr[j]+"\t");
			
		}

}
}
