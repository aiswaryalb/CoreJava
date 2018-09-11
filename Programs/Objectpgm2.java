import java.io.*;
import java.util.*;
class Student
{
	int id=1;
	String name="Priyanka";
}
class Objectpgm2
{
	
	
	public static void main(String args[])
	{
		Student ob1=new Student();
		System.out.println("ID\t\t NAME");
		System.out.println(ob1.id+"\t \t"+ob1.name);


	}	
}