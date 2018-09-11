import java.io.*;
import java.util.*;
class Student
{
	int id;
	String name;
	int age;
	
	Student(int i,String n)
	{
		
		id=i;
		name=n;
	}
	Student(int i,String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void displayValue()
	{
		
		System.out.println(id+"\t\t"+name+"\t\t"+age);
	}
}
class Constructor
{
	
	
	public static void main(String args[])
	{
		System.out.println("ID\t\tNAME\t\tAGE");
		Student ob1=new Student(1,"Aiswarya");
		Student ob2=new Student(2,"Arya",23);
		ob1.displayValue();
		ob2.displayValue();

		
		


	}	
}