import java.io.*;
import java.util.*;
class LinkedHashMap2
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(100,"Aiswarya");
		map.put(101,"Angel");
		map.put(102,"Meenu");
		
		System.out.println("Before removal "+map);
		map.remove(101);
		System.out.println("After removal "+map);
		
		
	}
}