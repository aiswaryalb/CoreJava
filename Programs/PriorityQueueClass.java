import java.io.*;
import java.util.*;
class PriorityQueueClass
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Aiswarya");
		queue.add("Angel");
		queue.add("Meenu");
		queue.add("Sreelekshmi");
		queue.add("Aswathy");
		
		System.out.println("Head "+queue.element());
		System.out.println("Head "+queue.peek());
		System.out.println("Elements in queue are ");
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing 2 elements");
		Iterator itr1=queue.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
	}
}