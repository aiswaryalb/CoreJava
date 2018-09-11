import java.io.*;
import java.util.*;
class Table
{
	synchronized static void printTable(int n)
	{
		for (int i=1;i<=5 ;i++ )
		{
			System.out.println(n*i);
			try
			{
			Thread.sleep(500);
			}
			catch(InterruptedException e){System.out.println(e);}
		}
	}
}
class MyThread1 extends Thread
{
	

	public void run()
	{
		Table.printTable(1);
	}
}
class MyThread2 extends Thread
{
	
	public void run()
	{
		Table.printTable(2);
	}
}

class MyThread3 extends Thread
{
	

	public void run()
	{
		Table.printTable(3);
	}
}
class MyThread4 extends Thread
{
	
	public void run()
	{
		Table.printTable(4);
	}
}




class StaticSync
{
	public static void main(String[] args)
	{
		MyThread1 p=new MyThread1();
		MyThread2 q=new MyThread2();
		MyThread3 r=new MyThread3();
		MyThread4 s=new MyThread4();
		p.start();
		q.start();
		r.start();
		s.start();
		
	}
}