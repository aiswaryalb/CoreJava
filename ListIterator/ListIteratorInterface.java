import java.io.*;
import java.util.*;
class ListIteratorInterface
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aiswarya");
		list.add("Angel");
		list.add("Meenu");
		list.add(2,"Priya");
		ListIterator<String> itr=list.listIterator();
		System.out.println("In forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
System.out.println("In reverse direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
	}
}