import java.io.*;
import java.util.*;
class Thread5 extends Thread
{
	public void run()
	{
		for (int i=0;i<5 ;i++ ) {
			try
			{
			Thread.sleep(500);
		}
		catch(InterruptedException e){System.out.println(e);}
			System.out.println(i);
		}
			
		}
	
	public static void main(String[] args) 
	{
		Thread5 obj=new Thread5();
		Thread5 obj1=new Thread5();
		Thread5 obj2=new Thread5();
		obj.start();
		try
		{
		obj.join();
	}
	catch(InterruptedException e){System.out.println(e);}
		obj1.start();
		obj2.start();
	}
}