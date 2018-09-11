import java.util.*;
import java.io.*;
class Armstrong
{
	public static void main(String[] args)
	 {
	 	int num1,sum=0,r=0,rev=0;
	 	Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=in.nextInt();
		num1=num;
		while(num1!=0)
		{
			r=num1%10;
			sum=sum+r*r*r;
			rev=rev*10+r;
			num1=num1/10;
		}
		if(sum==num)
		{
			System.out.println("It is Armstrong Number");
		}
		else
		{
			System.out.println("It is not an Armstrong Number");
		}

	}
}