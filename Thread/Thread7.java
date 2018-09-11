/* The currentThread() method returns a reference to the currently executing thread object*/
import java.io.*;
import java.util.*;
class Thread7 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread7 obj1=new Thread7();
		Thread7 obj2=new Thread7();
		obj1.start();
		obj2.start();
		
	}
}