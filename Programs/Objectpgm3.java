import java.io.*;
import java.util.*;
class Student
{
	int id;
	String name;
	void storeValue(int i,String n)
	{
		id=i;
		name=n;
	}
	void displayValue()
	{
		System.out.println(id+"\t\t"+name);
	}
}
class Objectpgm3
{
	
	
	public static void main(String args[])
	{
		Student ob1=new Student();
		Student ob2=new Student();
		ob1.id=1;
		ob1.name="Aiswarya";
		ob2.id=2;
		ob2.name="Balu";
		ob1.storeValue(ob1.id,ob1.name);
		ob2.storeValue(ob2.id,ob2.name);
		System.out.println("ID\t\tNAME");
		ob1.displayValue();
		ob2.displayValue();



	}	
}