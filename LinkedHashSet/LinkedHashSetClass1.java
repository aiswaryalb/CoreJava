import java.io.*;
import java.util.*;
class LinkedHashSetClass1
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> list=new LinkedHashSet<String>();
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