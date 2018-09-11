/*
 	 1
    212
   32123
  4321234
 543212345
  4321234
   32123
    212
     1


*/





import java.util.Scanner;
 
public class NumPattern
{
 
	public static void main(String args[])
	{
		int space;
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		space=rows;
		int val=rows-1;
		for (int i = 1; i <2*rows; i++)
		{
			
			if (i<=rows) 
			{

							for (int k=0;k<space ;k++ ) 
							{
								System.out.print(" ");
								
							}
						space--;
						for (int j=i;j>0 ;j-- ) 
						{
							System.out.print(j);
							
						}
						for (int l=2;l<=i ;l++ ) 
						{
							System.out.print(l);
							
						}
						

				
			}
			else 

			{
				space++;

						for (int k=0;k<=space ;k++ ) 
					{
						System.out.print(" ");
						
					}
				for (int j=val;j>0 ;j-- ) 
					{
						System.out.print(j);
						
					}
					for (int l=2;l<=val ;l++ ) 
					{
						System.out.print(l);
						
					}
								val--;
			}
			
			System.out.println();
		}
 }
}