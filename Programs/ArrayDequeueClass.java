import java.io.*;
import java.util.*;
class ArrayDequeueClass
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> dq=new ArrayDeque<String>();
		dq.add("Aiswarya");
		dq.add("Angel");
		dq.add("Aiswarya");
		dq.add("Meenu");
		dq.add("Angel");
		dq.offerFirst("LekshmiPriya");
		System.out.println("After offerFirst()");
		Iterator itr=dq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		dq.pollLast();
		System.out.println("After pollLast()");
		Iterator itr1=dq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

		
		
	}
}