import java.util.*;
import java.io.*;
class DigitSum
{
	public static void main(String[] args)
	 {
	 	int sum=0,num,rem=0,copy;
	 	Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		num=in.nextInt();
		copy=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits of "+copy+" = "+sum);
	}
}