/* Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
getPriority()
setPriority()
*/
import java.io.*;
import java.util.*;
class Priority extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Priority obj1=new Priority();
		Priority obj2=new Priority();
		obj1.start();
		obj2.start();
	}
}