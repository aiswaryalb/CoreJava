import java.util.*;
import java.io.*;
class MatrixAdd
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row and column of matrix 1");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter number of row and column of matrix 2");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r2][c2];
		if(r1==r2&&c1==c2)
		{

			System.out.println("Enter the elements of matrix 1");
			for (i=0;i<r1 ;i++ ) 
			{
				
				for (j=0;j<c1 ;j++ ) 
				{
					a[i][j]=sc.nextInt();
					
				}
			}

			System.out.println("Enter the elements of matrix 2");
			for (i=0;i<r2 ;i++ ) 
			{
				
				for (j=0;j<c2 ;j++ ) 
				{
					b[i][j]=sc.nextInt();
					
				}
			}

			System.out.println("The added matrix is");
			for ( i=0;i<r1 ;i++ ) 
			{
				
				for (j=0;j<c1 ;j++ )
				 {
				 	c[i][j]=0;
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(" "+c[i][j]+" ");
				}
				System.out.println();
			}

			
		}
		else
		{
			System.out.println("Addition not possible");
		}

	}
}