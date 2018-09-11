/* If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.*/

import java.io.*;
import java.util.*;
class Parent
{
	void msg()
	{
		System.out.println("Hello");
	}
}
class Child2 extends Parent
{
	void msg()throws ArithmeticException
		{
			System.out.println("Heyy");
		}
	public static void main(String[] args)
	 {
	 	Parent p=new Child2();
	 	p.msg();
		
	}
}