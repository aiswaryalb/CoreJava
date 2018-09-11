import java.io.*;
import java.util.*;
class Interrupt3 extends Thread
{
	public void run()
	{
		for (int i=1;i<=2 ;i++ )
		{
			if (Thread.interrupted())
			{
				System.out.println("Code for interrupted thread");
				
			}
			else
			{
				System.out.println("Code for normal thread");
			}
			
		}
	}
	public static void main(String[] args)
	{
		Interrupt3 obj=new Interrupt3();
		Interrupt3 obj1=new Interrupt3();
		obj.start();
		obj.interrupt();
		obj1.start();

		
	}
}