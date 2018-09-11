import java.io.*;
import java.util.*;
class Collection3
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aiswarya");
		list.add("Angel");
		list.add("Meenu");	
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Aarya");
		list1.add("Anagha");
		list1.add("Meenakshi");		
		list.addAll(list1);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}	
}