




import java.awt.*; 
import java.io.*;
import java.applet.*; 
import java.awt.event.*;
/*<applet width=400 height=400 code="BarGraph">     
 
<param name=w1 value=100>
<param name=w2 value=150>
<param name=w3 value=80>
<param name=w4  value=180>

<param name=y1 value=1991>
<param name=y2 value=1992>
<param name=y3  value=1993>
<param name=y4 value=1994>

<param name =Column value=4>
</applet>
*/  
public class BarGraph extends Applet
{
	int n=0;
	int widths[];
	String years[];
	public void init()
	{
		setBackground(Color.PINK);
		n=Integer.parseInt(getParameter("Column"));
		years=new String[n];
		widths=new int[n];

		years[0]=getParameter("y1");
		years[1]=getParameter("y2");
		years[2]=getParameter("y3");
		years[3]=getParameter("y4");

		widths[0]=Integer.parseInt(getParameter("w1"));
		widths[1]=Integer.parseInt(getParameter("w2"));
		widths[2]=Integer.parseInt(getParameter("w3"));
		widths[3]=Integer.parseInt(getParameter("w4"));

		
		

	}
	public void paint(Graphics g)
	{
		for (int i=0;i<4 ;i++ ) 
		{
			g.setColor(Color.RED);
			g.drawString(years[i],20,i*50+30);
		   g.setColor(Color.red);
		   g.fillRect(50,i*50+10,widths[i],40);

			
		}
		
		
		
	}
}