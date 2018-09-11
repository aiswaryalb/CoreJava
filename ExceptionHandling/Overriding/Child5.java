/*in case subclass overridden method declares subclass exception*/
import java.io.*;
import java.util.*;
class Parent
{
	void msg()throws Exception
	{
		System.out.println("Hello");
	}
}
class Child5 extends Parent
{
	void msg()throws ArithmeticException
		{
			System.out.println("Heyy");
		}
	public static void main(String[] args)
	 {
	 	try
	 	{
	 	Parent p=new Child5();
	 	p.msg();
	 }
	 catch(Exception e){System.out.println("Exception handled");}
		
	}
}