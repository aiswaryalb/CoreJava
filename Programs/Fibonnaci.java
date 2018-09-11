import java.util.*;
import java.io.*;
class Fibonnaci
{
	public static void main(String[] args)
	 {
	 	int limit,i=3,a=0,b=1,c=0;
	 	Scanner in = new Scanner(System.in);
		System.out.println("Enter Limit");
		limit=in.nextInt();
		if(limit==1)
		{
			System.out.println(a);
		}
		else
		{
			System.out.print(a+"\t"+b);
			for (i=3;i<=limit ;i++ ) {
				
				c=a+b;
			System.out.print("\t"+c);
		
				a=b;
				b=c;
			}
		}

	}
}
