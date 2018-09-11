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
		System.out.println("In child class1");
	}
}
class Child1 extends Base
{
	void func2()
	{
		System.out.println("In child class2");
	}
}
class Hierarchical
{
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.func();
		obj.func1();
		Child1 obj1=new Child1();
		obj1.func();
		obj1.func2();
		
	}
}