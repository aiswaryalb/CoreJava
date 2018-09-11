import java.io.*;
import java.util.*;
class NestedTry
{
	public static void main(String[] args) 
	{
		try
		{
			

			try
			{
				System.out.println("Array operation");
				int arr[]=new int[5];
				arr[9]=8;
			}
			catch(ArrayIndexOutOfBoundsException e){System.out.println("Array out of bounds");}
			try
			{
				System.out.println("Dividing");
			int a=90/0;
			}
			catch(ArithmeticException e){System.out.println("Division by zero not possible");}
		}
		catch(Exception e){System.out.println("Common task");}
		System.out.println("rest of code");
	}
}