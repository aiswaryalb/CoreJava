import java.io.*;
import java.util.*;
class ThreadGroupDemo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadGroupDemo runnable=new ThreadGroupDemo();
		ThreadGroup obj1=new ThreadGroup("Parent ThreadGroup");
		Thread t1=new Thread(obj1,runnable,"one");
		t1.start();
		Thread t2=new Thread(obj1,runnable,"two");
		t2.start();
		Thread t3=new Thread(obj1,runnable,"three");
		t3.start();
		System.out.println("Thread group name "+obj1.getName());
		obj1.list();

		
	}
}