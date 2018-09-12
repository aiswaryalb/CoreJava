import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*

<applet code="MouseAdapterDemo" width=300 height=300>
</applet>
*/
public class MouseAdapterDemo extends Applet
{
	String s="Hello from Java";
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
	}
	public void paint(Graphics g)
	{
		g.drawString(s,60,100);

	}

}
class MyMouseAdapter extends MouseAdapter
{
	MouseAdapterDemo adapterDemo;
	public MyMouseAdapter(MouseAdapterDemo ad)
	{
		adapterDemo =ad;
	}
	public void mouseClicked(MouseEvent me)
	{
		adapterDemo.s="Mouse Clicked";
		adapterDemo.repaint();
	}
}