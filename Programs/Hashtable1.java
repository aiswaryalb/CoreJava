import java.io.*;
import java.util.*;
class HashTable1
{
	public static void main(String[] args) 
	{
		HashTable<Integer,String> map=new HashTable<Integer,String>();
		map.put(100,"Aiswarya");
		map.put(101,"Angel");
		map.put(102,"Meenu");
		
		for (Map.Entry m : map.entrySet() )
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
			
		}

		
		
	}
}