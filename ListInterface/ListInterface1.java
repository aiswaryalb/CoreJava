import java.io.*;
import java.util.*;
class ListInterface1
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aiswarya");
		list.add("Angel");
		list.add("Meenu");
		list.add(2,"Priya");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Element at position 3 is "+list.get(3));
		
	}
}