import java.io.*;
import java.util.*;
class Interrupt1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(500);
			System.out.println("Thread running");
		}
		catch(InterruptedException e){System.out.println("Exception handled"+e);}
	}
	public static void main(String[] args)
	{
		Interrupt1 obj=new Interrupt1();
		Interrupt1 obj1=new Interrupt1();
		obj.start();
		obj.interrupt();
		obj1.start();

		
	}
}