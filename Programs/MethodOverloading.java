class Example
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b,float c)
	{
		return a+b+c;
	}
}
class MethodOverloading
{
	public static void main(String[] args) {

		Example obj=new Example();
		int p=obj.add(2,3);
		float q=obj.add(2.3f,5.4f);
		int r=obj.add(1,2,3);
		float s=obj.add(1.2f,2.3f,3.1f);
		System.out.println("Sum of 2 integer numbers is "+p);
		System.out.println("Sum of 2 float numbers is  "+q);
		System.out.println("Sum of 3 integer numbers is "+r);
		System.out.println("Sum of 3 float numbers is "+s);
	}
}