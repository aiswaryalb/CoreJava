import java.io.*;
import java.util.*;
class Num{
	public static void main(String args[]){
	System.out.println("Enter limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("The numbers are \n");
	for(int i=1;i<=limit;i++)
	{
		System.out.println(i);
	}
	}
}