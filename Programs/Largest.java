import java.io.*;
import java.util.*;
class Largest{
	public static void main(String args[])
	{
	int large=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b)
	{
	large=a;
	}
	else
	{
	large=b;
	}
	if(c>large)
	{
	large=c;
	}
	System.out.println("Largest number is "+large);
	}
}