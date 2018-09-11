class Base
{
	final void func()
	{
		System.out.println("Base class");
	}
}
class Derived extends Base
{
	void func()
	{
		System.out.println("Derived class");
	}
}
class Final2
{
	public static void main(String args[])
	{
		Derived obj=new Derived();
		obj.func();
	}
}