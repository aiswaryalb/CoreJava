import java.awt.*; 
import java.io.*;
import java.applet.*; 
import java.awt.event.*;
/*
<applet code="Car" width=500 height=500>
</applet>

*/

public class Car extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.PINK);
		g.setColor(Color.RED);
		g.fillRect(250,260,60,10);
		g.setColor(Color.BLUE);
		g.fillOval(260,270,10,10);
		g.setColor(Color.BLUE);
		g.fillOval(290,270,10,10);

		int x[]={260,270,290,300};
		int y[]={260,250,250,260};
		g.setColor(Color.YELLOW);
		g.fillPolygon(x,y,4);

	}

}