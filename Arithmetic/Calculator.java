package Arithmetic;
public class Calculator
{
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println( a+" + "+b+" = "+ c);
	}
	public static void subtract(int a,int b)
	{
		int c=a-b;
		System.out.println(a+" - "+b+" = "+ c);
	}
	public static void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println(a+" * "+b+" = "+ c);
	}
	public static void divide(int a,int b)
	{
		int c=a/b;
		System.out.println(a+" / "+b+" = "+ c);
	}
}