/*in case subclass overridden method declares no exception*/
import java.io.*;
import java.util.*;
class Parent
{
	void msg()throws Exception
	{
		System.out.println("Hello");
	}
}
class Child6 extends Parent
{
	void msg()
		{
			System.out.println("Heyy");
		}
	public static void main(String[] args)
	 {
	 
	 	try
	 	{
	 	Parent p=new Child6();
	 	p.msg();
	 	}
	 	catch(Exception e){}
		
	}
}