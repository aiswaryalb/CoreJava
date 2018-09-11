import java.awt.*; 
import java.io.*;
import java.applet.*; 
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="RingAnimation" width=500 height=500>
</applet>

*/
public class RingAnimation extends Applet
{
	public void paint(Graphics g)
	{
		int a=150,b=150,c=10,d=10;
		g.setColor(Color.RED);
		for (int i=0;i<15 ;i++ ) 
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}

			g.drawOval(a,b,c,d);
			a-=10;
			b-=10;
			c+=8;
			d+=8;
			
		}
	}


}