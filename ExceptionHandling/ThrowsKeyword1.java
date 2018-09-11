import java.io.*;
import java.util.*;
class ThrowsKeyword1
{
	void p()throws IOException
	{
		throw new IOException("Device error");

	}
	
	
	public static void main(String[] args)throws IOException
	{
		ThrowsKeyword1 obj=new ThrowsKeyword1();
		obj.p();
		System.out.println("rest of code");	
	}


}
	