import java.io.*;
import java.util.*;
class TreeSetClass1
{
	public static void main(String[] args) 
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("10");
		set.add("4");
		set.add("1");
		set.add("34");
		set.add("2");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(set);

		
		
	}
}