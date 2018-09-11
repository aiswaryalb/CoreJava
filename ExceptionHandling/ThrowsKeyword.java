import java.io.*;
import java.util.*;
class ThrowsKeyword
{
	void m()throws IOException
	{
		throw new IOException("Device error");

	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{

			n();
		}
		catch(Exception e){System.out.println("Exception handled");}
	}
	public static void main(String[] args) 
	{
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.p();
		System.out.println("rest of code");	
	}


}
	