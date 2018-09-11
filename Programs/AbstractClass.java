abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
}

class AbstractClass 
{
	public static void main(String args[])
	{
		Shape a,b,c;
		a=new Rectangle();
		b=new Circle();
		c=new Triangle();
		a.draw();
		b.draw();
		c.draw();
	}
}