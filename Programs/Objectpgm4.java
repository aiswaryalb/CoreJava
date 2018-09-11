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
class Objectpgm4
{
	
	
	public static void main(String args[])
	{
		Student ob1=new Student();
		Student ob2=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of first student");
		ob1.id=sc.nextInt();
		
		ob1.name="Diya";
		System.out.println("Enter id  of second student");
		ob2.id=sc.nextInt();
		ob2.name="Riya";
		ob1.storeValue(ob1.id,ob1.name);
		ob2.storeValue(ob2.id,ob2.name);
		System.out.println("ID\t\tNAME");
		ob1.displayValue();
		ob2.displayValue();



	}	
}