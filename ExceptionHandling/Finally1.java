import java.io.*;
import java.util.*;
class Finally1
{
	public static void main(String[] args) 
	{
		try
		{
			int a=50/0;
		}
		catch(ArithmeticException e){System.out.println(e);}
		finally{System.out.println("this will always be executed");}
		System.out.println("Rest of code");	
	}

}