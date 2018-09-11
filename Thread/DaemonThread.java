/* daemon thread provides services to  user thread
isDaemon()
setDaemon()
*/
import java.io.*;
import java.util.*;
class DaemonThread extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread");
		}
		else
		{
			System.out.println("User thread");
		}
	}
	public static void main(String[] args) {
		
		DaemonThread obj1=new DaemonThread();
		DaemonThread obj2=new DaemonThread();
		DaemonThread obj3=new DaemonThread();
		obj1.setDaemon(true);
		obj1.start();
		obj2.start();
		obj3.start();
	}
	
}
