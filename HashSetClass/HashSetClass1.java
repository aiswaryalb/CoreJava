import java.io.*;
import java.util.*;
class HashSetClass1
{
	public static void main(String[] args) 
	{
		HashSet<String> set=new HashSet<String>();
		set.add("Aiswarya");
		set.add("Angel");
		set.add("Aiswarya");
		set.add("Meenu");
		set.add("Angel");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
		
	}
}