import java.io.*;
import java.util.*;
class LinkedListClass
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Aiswarya");
		list.add("Angel");
		list.add("Meenu");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}