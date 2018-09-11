interface Drawable
{
	void draw();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class Triangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
}
class Interface2
{
	public static void main(String[] args) {
		Drawable d=new Rectangle();
		d.draw();
		d=new Triangle();
		d.draw();
	}
}