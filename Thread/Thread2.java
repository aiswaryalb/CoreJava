/* Java Thread Example by implementing Runnable interface */
import java.io.*;
import java.util.*;
class Thread2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) 
	{
		Thread2 obj=new Thread2();
		Thread m=new Thread(obj);
		m.start();
		
	}
}