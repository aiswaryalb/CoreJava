import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="SimpleProgram" width=200 height =60>
</applet>
*/
public class SimpleProgram extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("This is a sample applet",10,60);
	}

}