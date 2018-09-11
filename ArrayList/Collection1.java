import java.io.*;
import java.util.*;
class Collection1
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<String>();
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