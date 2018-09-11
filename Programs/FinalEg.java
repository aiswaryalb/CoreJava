class Base
{
	final int value=6789;
void func()
{
	 value=89;
}
}
class FinalEg
{
	public static void main(String args[])
	{
		Base obj=new Base();
		obj.func();
	}
}