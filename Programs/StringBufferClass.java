import java.io.*;
import java.util.*;
class StringBufferClass
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice,contin;
		do
		{
			System.out.println("Press \n 1.append() \n 2.insert() \n 3.replace() \n 4.delete() \n 5.reverse()");
			System.out.println("Enter choice");
				choice=sc.nextInt();
		
		
			switch(choice)
			{
				case 1: System.out.println("append() method");
						System.out.println("Enter string 1");
						StringBuffer s1=new StringBuffer(sc.next());
						System.out.println("Enter string 2");
						StringBuffer s2=new StringBuffer(sc.next());
						s1.append(s2);
						System.out.println(s1);
						break;

				case 2: System.out.println("insert() method");
						System.out.println("Enter string 1");
					    s1=new StringBuffer(sc.next());
						System.out.println("Enter string to insert");
						s2=new StringBuffer(sc.next());
						System.out.println("Enter index to insert ");
						int index=sc.nextInt();
						s1.insert(index,s2);
						System.out.println(s1);
						break;

				case 3: System.out.println("replace() method");
						System.out.println("Enter string 1");
					    s1=new StringBuffer("Hello");
						System.out.println("Enter string to replace");
						
						System.out.println("Enter start and end index  ");
						int start=sc.nextInt();
						int end=sc.nextInt();
						s1.replace(start,end,"java");
						System.out.println(s1);
						break;

				case 4: System.out.println("delete() method");
						System.out.println("Enter string 1");
					    StringBuffer p1=new StringBuffer(sc.next());
						
						
						System.out.println("Enter start and end index  ");
						 start=sc.nextInt();
						 end=sc.nextInt();
						p1.delete(start,end);
						System.out.println(p1);
						break;

				case 5: System.out.println("reverse() method");
						System.out.println("Enter string 1");
					    p1=new StringBuffer(sc.next());
						
						
						
						p1.reverse();
						System.out.println(p1);
						break;

				default: System.out.println("Invalid choice");
			}
			System.out.println("Press 1 to continue ");
			contin=sc.nextInt();
		}
		while(contin==1);
	}
}