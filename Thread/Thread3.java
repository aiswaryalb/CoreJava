/*sleep method in java*/
import java.io.*;
import java.util.*;
class Thread3 extends Thread
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
		Thread3 obj=new Thread3();
		Thread3 obj1=new Thread3();
		obj.start();
		obj1.start();
		
	}
}