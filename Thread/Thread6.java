/* getName(),setName(String) and getId() method*/
import java.io.*;
import java.util.*;
class Thread6 extends Thread
{
	public void run()
	{
		System.out.println("Thread running");
	}
	public static void main(String[] args) 
	{
		Thread6 obj1=new Thread6();
		Thread6 obj2=new Thread6();
		System.out.println("Name of thread 1 \t"+obj1.getName());
		System.out.println("Name of thread 2 \t"+obj2.getName());
		System.out.println("ID of thread 1 \t"+obj1.getId());
		System.out.println("ID of thread 2 \t"+obj2.getId());


		obj1.start();
		obj2.start();

		obj1.setName("Aiswarya");
		obj2.setName("Pillai");
		System.out.println("After changing ");
		System.out.println("Name of thread 1 \t"+obj1.getName());
		System.out.println("Name of thread 2 \t"+obj2.getName());


		
	}
} 