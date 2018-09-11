import java.util.*;
import java.io.*;
class DiagonalSum
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows of square matrix");
		int row=sc.nextInt();
		int arr[][]=new int[row][row];
		int column=row,sum=0;
		System.out.println("Enter the elements of matrix");
		for (int r=0;r<row ;r++ ) 
		{
			
			for (int c=0;c<column ;c++ ) 
			{
				arr[r][c]=sc.nextInt();
				
			}
		}
		System.out.println("The matrix is");
		for (int r=0;r<row ;r++ ) 
		{
			
			for (int c=0;c<column ;c++ )
			 {
				System.out.print(" "+arr[r][c]+" ");
				
			}
			System.out.println();
		}

		System.out.println("The diagonal sum is ");
		for (int r=0;r<row ;r++ )
		 {
			
			for (int c=0;c<column ;c++ ) 
			{
				if(r==c)
				{
					sum=sum+arr[r][c];
				}
				
			}
			
		}
		System.out.print(sum);

	}
}