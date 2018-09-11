import java.awt.*; 
import java.io.*;
import java.applet.*; 
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="OlympicRing" width=500 height=500>
</applet>

*/
public class OlympicRing extends Applet
{

	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawOval(10,10,100,100);

		g.setColor(Color.YELLOW);
		g.drawOval(60,60,100,100);

		g.setColor(Color.BLACK);
		g.drawOval(120,10,100,100);

		g.setColor(Color.GREEN);
		g.drawOval(180,60,100,100);

		g.setColor(Color.RED);
		g.drawOval(230,10,100,100);


	}
}

