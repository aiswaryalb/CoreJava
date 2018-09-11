/*If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.*/

import java.io.*;
import java.util.*;
class Parent
{
	void msg()
	{
		System.out.println("Hello");
	}
}
class Child1 extends Parent
{
	void msg()throws IOException
		{
			System.out.println("Heyy");
		}
	public static void main(String[] args)
	 {
	 	Parent p=new Child1();
	 	p.msg();
		
	}
}