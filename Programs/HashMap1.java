import java.io.*;
import java.util.*;
class HashMap1
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"Aiswarya");
		map.put(101,"Angel");
		map.put(102,"Meenu");
		
		System.out.println("Before removal "+map);
		map.remove(101);
		System.out.println("After removal "+map);
		
		
	}
}