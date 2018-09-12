/*
To compile ::::::  javac CheckBoxGroupDemo.java
To execute ::::::  appletViewer CheckBoxGroupDemo.java


*/


import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CheckBoxGroupDemo" width=250  height=300>
</applet>
*/
public class CheckBoxGroupDemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox Win98,WinNT,Win7;
	CheckboxGroup cbg;
	public void init()
	{
		cbg=new CheckboxGroup();
		Win98=new Checkbox("Windows 98/XP",cbg,true);
		WinNT=new Checkbox("Windows NT/2000",cbg,false);
		Win7=new Checkbox("Windows 7",cbg,true);

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
		msg="Current Selection :";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,6,80);

		
	}
}