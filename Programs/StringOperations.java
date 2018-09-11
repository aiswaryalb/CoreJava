import java.io.*;
import java.util.*;
class StringOperations
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice,contin;
		do
		{
				System.out.println("Press \n 1.Compare by equals method \n 2.Compare by equalsIgnoreCase method \n 3.Compare by == operator\n 4.Compare by compareTo method \n 5.Concatenation by concat() method \n 6.Concatenation by + operator \n 7.Substring \n 8.Uppercase \n 9.Lowercase");
				System.out.println(" 10.trim() \n 11.startsWith() and endsWith() \n 12.charAt() \n 13.length() \n 14.valueOf() \n 15.replace()");
				System.out.println("Enter choice");
				choice=sc.nextInt();
		
		
			switch(choice)
			{
				case 1: System.out.println("equals() method");
						System.out.println("Enter string 1");
						String s1=new String(sc.next());
						System.out.println("Enter string 2");
						String s2=new String(sc.next());
						System.out.println(s1.equals(s2));
						break;

				case 2:System.out.println("equalsIgnoreCase() method");
						System.out.println("Enter string 1");
						 s1=new String(sc.next());
						System.out.println("Enter string 2");
						 s2=new String(sc.next());
						System.out.println(s1.equalsIgnoreCase(s2));
						break;
				case 3: 
						System.out.println("== operator");
						System.out.println("Enter string 1");
						 s1=new String(sc.next());
						System.out.println("Enter string 2");
						 s2=new String(sc.next());
						System.out.println(s1==s2);
						break;
				case 4:
						System.out.println("compareTo method");
						System.out.println("Enter string 1");
						 s1=new String(sc.next());
						System.out.println("Enter string 2");
						 s2=new String(sc.next());
						System.out.println(s1.compareTo(s2));
						break;
				case 5:
						System.out.println("Concatenation concat()");
						System.out.println("Enter string 1");
						 s1=new String(sc.next());
						System.out.println("Enter string 2");
						 s2=new String(sc.next());
						System.out.println(s1.concat(s2));
						break;
				case 6:
						System.out.println("Concatenation + operator");
						System.out.println("Enter string 1");
						 s1=new String(sc.next());
						System.out.println("Enter string 2");
						 s2=new String(sc.next());
						System.out.println(s1+s2);
						break;

				case 7:System.out.println("Find substring");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						System.out.println("Enter start and end range");
						 int start=sc.nextInt();
						 int end=sc.nextInt();
						System.out.println(s1.substring(start,end));
						break;

				case 8:System.out.println("Uppercase");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						
						System.out.println(s1.toUpperCase());
						break;

				case 9:System.out.println("Lowercase");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						
						System.out.println(s1.toLowerCase());
						break;

				case 10:System.out.println("trim()");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						
						System.out.println(s1.trim());
						break;

				case 11:System.out.println("startsWith() and endsWith()");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						System.out.println("Enter start string to check");
						 String a=new String(sc.next());
						 System.out.println(s1.startsWith(a));
						 System.out.println("Enter end string to check ");
						 String b=new String(sc.next());
						
						System.out.println(s1.endsWith(b));
						break;

				case 12:System.out.println("charAt()");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						System.out.println("Enter index");
						 int index=sc.nextInt();
						 System.out.println(s1.charAt(index));
						 
						break;

				case 13:System.out.println("length()");
						System.out.println("Enter string ");
						 s1=new String(sc.next());
						System.out.println("length of string is "+s1.length());
						 
						break;

				case 14:System.out.println("valueOf()");
						System.out.println("Enter int value ");
						int val=sc.nextInt();
						String v1=String.valueOf(val);
						System.out.println(v1);
						 
						break;

				case 15:System.out.println("replace()");
						String rep="Java is a very useful programming language.Programming in java is fun .";
						System.out.println("String is \n "+rep);
						System.out.println("Enter string to replace ");
						 String r1=new String(sc.next());
						 System.out.println("Enter replacing string ");
						 String r2=new String(sc.next());
						System.out.println(rep.replace(r1,r2));
						 
						break;


				default: System.out.println("Invalid choice");
			}
			System.out.println("Press 1 to continue ");
			contin=sc.nextInt();

		}
		while(contin==1);
	}

}