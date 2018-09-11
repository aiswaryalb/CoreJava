class Base
{
	void func()
	{
		System.out.println("In base class");
	}

}
class Child extends Base
{
	void func1()
	{
		System.out.println("In child class");
	}
}
class Super extends Child
{
 void func2()
 {
 	System.out.println("In Final class");
 }
}
class Multilevel 
{
	public static void main(String args[])
	{
	Super obj=new Super();
		obj.func();
		obj.func1();
		obj.func2();
		
	}
}