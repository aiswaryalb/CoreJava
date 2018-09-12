/*
To compile ::::::  javac CheckBoxDemo.java
To execute ::::::  appletViewer CheckBoxDemo.java


*/


import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CheckBoxDemo" width=250  height=300>
</applet>
*/
public class CheckBoxDemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox Win98,WinNT,Win7;
	public void init()
	{
		Win98=new Checkbox("Windows 98/XP",null,true);
		WinNT=new Checkbox("Windows NT/2000");
		Win7=new Checkbox("Windows 7");
		add(Win98);
		add(WinNT);
		add(Win7);
		Win98.addItemListener(this);
		WinNT.addItemListener(this);
		Win7.addItemListener(this);


	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();

	}
	public void paint(Graphics g)
	{
		msg="Current State :";
		g.drawString(msg,6,80);

		msg="Windows 98/XP   "+Win98.getState();
		g.drawString(msg,6,100);

		msg="Windows NT/2000   "+WinNT.getState();
		g.drawString(msg,6,120);

		msg="Windows 7   "+Win7.getState();
		g.drawString(msg,6,140);
	}
}