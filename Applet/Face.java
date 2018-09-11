import java.awt.*; 
import java.io.*;
import java.applet.*; 
import java.awt.event.*;
/*
<applet code="Face" width=500 height=500>
</applet>

*/
public class Face extends Applet
{

		public void paint(Graphics g)
	{
		setBackground(Color.WHITE);
		g.setColor(Color.PINK);
		g.fillOval(100,100,130,130);
		
		g.setColor(Color.PINK);
		g.fillOval(90,150,20,20);
		g.setColor(Color.PINK);
		g.fillOval(220,150,20,20);

		g.setColor(Color.WHITE);
		g.fillOval(120,150,20,20);


		/**/
		g.setColor(Color.BLACK);
		g.fillOval(125,155,10,10);

		g.setColor(Color.WHITE);
		g.fillOval(190,150,20,20);

		/**/

		g.setColor(Color.BLACK);
		g.fillOval(195,155,10,10);

		g.setColor(Color.WHITE);
		g.fillRect(150,200,30,10);



		


	}


}