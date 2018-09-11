import java.util.*;
import java.io.*;
class OddEvenSum
{
	public static void main(String[] args)
	 {
	 	int osum=0,esum=0;
	 	Scanner in = new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=in.nextInt();
		
		
			for (int i=1;i<=limit ;i++ ) {
				if(i%2==0)
				{
					esum=esum+i;
				}
				else
				{
					osum=osum+i;
				}
				
			}
		System.out.println("Sum of even is "+esum);
		System.out.println("Sum of odd is "+osum);	
		

	 }
}