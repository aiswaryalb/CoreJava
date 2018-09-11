//mutiple inheritance via interface
interface Printable
{
	void print();
}
interface Showable
{
	void show();
}

class Interface3 implements Printable,Showable
{
	public void print()
	{
		System.out.println("Printing");
	}
	public void show()
	{
		System.out.println("Showing");
	}
	public static void main(String[] args) {
		Interface3 obj=new Interface3();
		obj.print();
		obj.show();
	}
}