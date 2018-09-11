class Parent
{
	void function()
	{
		System.out.println("In base class");
	}
}
class Child extends Parent
{
	void function()
	{
		System.out.println("In child class");
	}
}
class Overriding
{
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.function();
	}
}