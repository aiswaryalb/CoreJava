import java.io.*;
import java.util.*;
class Collection4
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aiswarya");
		list.add("Angel");
		list.add("Meenu");	
		list.add("Aarya");
		list.add("Anagha");
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Aarya");
		list1.add("Anagha");
		list1.add("Meenakshi");		
		list.addAll(list1);
		list.removeAll(list1);
		Iterator itr=list.iterator();
		
		
		System.out.println("After removing");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}	
}