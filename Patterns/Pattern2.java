/*
Pattern 
* * * 
* * 
*


*/import java.util.*;
import java.io.*;
class Pattern2
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=in.nextInt();
		for (int i=rows;i>=1 ;i-- ) {
			for (int k=0;k<i ;k++ ) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}