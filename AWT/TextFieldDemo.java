/*
To compile ::::::  javac ProgramName.java
To execute ::::::  appletViewer ProgramName.java


*/

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="TextFieldDemo" width=250  height=300>
</applet>
*/
public class TextFieldDemo extends Applet implements TextListener
{
	TextField name,pass;
	public void init()
	{
		Label namep=new Label("Name : ",Label.RIGHT);
		Label passp=new Label("Password : ",Label.RIGHT);
		name=new TextField(12);
		pass=new TextField(8);
		pass.setEchoChar('?');
		add(namep);
		add(name);
		add(passp);
		add(pass);
		name.addTextListener(this);
		pass.addTextListener(this);



	}

	public void textValueChanged(TextEvent ae)
	{
		repaint();

	}

	public void paint(Graphics g)
	{
		g.drawString("Name : "+name.getText(),6,60);
		g.drawString("Selected text in name : "+name.getSelectedText(),6,80);
		g.drawString("Password : "+pass.getText(),6,100);


	}

	
}