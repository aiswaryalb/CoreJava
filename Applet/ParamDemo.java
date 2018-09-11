import java.io.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="ParamDemo" width=300 height =80>
<param name=FirstName value="Aiswarya">
<param name=LastName value="Pillai">

</applet>
*/
public class ParamDemo extends Applet
{
	String str;
	public void init()
	{
		str="My Name is "+getParameter("FirstName")+" "+getParameter("LastName");
	}
	public void paint(Graphics g)
	{
		g.drawString(str,10,40);


	}

}