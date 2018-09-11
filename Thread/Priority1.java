import java.io.*;
import java.util.*;
class Priority1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Priority1 obj1=new Priority1();
		Priority1 obj2=new Priority1();
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();
	}
}