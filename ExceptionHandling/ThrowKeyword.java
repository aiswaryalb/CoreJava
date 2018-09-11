import java.io.*;
import java.util.*;
class ThrowKeyword
{
	static void check(int age)
	{
		if (age<18) 
		{

			throw new ArithmeticException("not valid");
		}
		else
			System.out.println("You can vote");
	}
	public static void main(String[] args) 
	{
		check(13);
		System.out.println("rest of code");
	}

}