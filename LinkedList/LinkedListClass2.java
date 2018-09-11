import java.io.*;
import java.util.*;
class LinkedListClass2
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Aiswarya");
		list.add("Angel");
		list.add("Meenu");


		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Ashwin");
		list1.add("Arun");
		list1.add("Manish");

		System.out.println("Array "+list1);
		System.out.println("Linked List"+list);
		
	}
}