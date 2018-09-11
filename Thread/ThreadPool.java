/* Thread pool contains a set of worker threads.When a task is obtained we can reuse these existing threads .Hence it reduces delay in creation of thread and provides efficient use of resource */
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
class WorkerThread implements Runnable
{
	String message;
	public WorkerThread(String message)
	{
		this.message=message;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"\t Start \t"+message);
		try
		{

		Thread.sleep(2000);
		}
		catch(InterruptedException e){System.out.println(e);}
		System.out.println(Thread.currentThread().getName()+"\t End \t"+message);
	}
	
}
class ThreadPool 
{
	public static void main(String[] args) 
	{
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for (int i=0;i<10;i++ )
		 {
		 	Runnable Worker=new WorkerThread(" "+i);
		 	executor.execute(Worker);
			
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{}
	System.out.println("Finished all threads");
		
	}
}