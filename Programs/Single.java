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
class Single 
{
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.func();
		obj.func1();
		
	}
}