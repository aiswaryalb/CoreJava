abstract class Base
{
	Base()
	{
		System.out.println("In constructor");
	}
	abstract void func();
	void f1()
	{
		System.out.println("In function");
	}
	
}
class Derived extends Base
{
	void func()
	{
		System.out.println("In Derived class");
	}
}
class AbstractClass2
{
	public static void main(String args[])
	{
Base obj=new Derived();
obj.func();
obj.f1();
	}
}