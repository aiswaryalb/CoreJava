import java.io.*;
import java.util.*;
class MultipleCatch
{
	public static void main(String[] args)
	{
		try
		{
			int a=50/0;
			int arr[]=new int[5];
			arr[10]=89;
			String s="hello";
			int p=s.length();

		}
		catch(ArithmeticException e){System.out.println("Division by zero");
		catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		catch(Exception e){System.out.println("Common task");}
		System.out.println("Rest of code");
	}
}