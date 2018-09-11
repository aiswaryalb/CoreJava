/*Problem if you direct call run() method*/
import java.io.*;
import java.util.*;
class Thread4 extends Thread
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
		Thread4 obj=new Thread4();
		Thread4 obj1=new Thread4();
		obj.run();
		obj1.run();
		
	}
}