import java.io.*;
import java.util.*;
class Table
{
	void printTable(int n)
	{
		synchronized(this)
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
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}



class JavaSyncBlock
{
	public static void main(String[] args)
	{
		Table obj=new Table();
		MyThread1 x=new MyThread1(obj);
		MyThread2 y=new MyThread2(obj);
		x.start();
		y.start();
		
	}
}