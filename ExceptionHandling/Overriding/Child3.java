/*If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.*/
/*in case subclass overridden method declares parent exception*/
import java.io.*;
import java.util.*;
class Parent
{
	void msg()throws ArithmeticException
	{
		System.out.println("Hello");
	}
}
class Child3 extends Parent
{
	void msg()throws Exception
		{
			System.out.println("Heyy");
		}
	public static void main(String[] args)
	 {
	 	Parent p=new Child3();
	 	p.msg();
		
	}
}