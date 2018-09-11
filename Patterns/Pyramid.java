/*
Pattern 
         *
        * *
       * * *
*/import java.util.*;
import java.io.*;
class Pyramid
{
	public static void main(String[] args) {
		int space,rows;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows");
		rows=in.nextInt();
		space=rows;
		for (int i=1;i<=rows ;i++ ) {
			for (int k=space;k>=1;k-- ) {
				System.out.print(" ");
				
			}
			space=space-1;
			for (int j=0 ;j<i ;j++ ) {
				System.out.print("* ");
			}

			
			

			
			
			System.out.print("\n");
		}

	}
}