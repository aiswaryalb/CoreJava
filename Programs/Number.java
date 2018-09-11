import java.io.*;
import java.util.*;
class Number{
	public static void main(String args[])
	{
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:System.out.println("Choice 1");
			break;
	case 2:System.out.println("Choice 2");
			break;		
	default:System.out.println("Invalid choice ");
			break;
	}

	}
}