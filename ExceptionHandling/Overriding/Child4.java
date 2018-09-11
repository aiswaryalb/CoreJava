/*in case subclass overridden method declares same exception*/
import java.io.*;
import java.util.*;
class Parent
{
	void msg()throws ArithmeticException
	{
		System.out.println("Hello");
	}
}
class Child4 extends Parent
{
	void msg()throws ArithmeticException
		{
			System.out.println("Heyy");
		}
	public static void main(String[] args)
	 {
	 	Parent p=new Child4();
	 	p.msg();
		
	}
}