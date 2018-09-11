import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CardLayoutExample" width=300 height=300>
</applet>

*/
public class CardLayoutExample extends Applet implements ActionListener
{
	CardLayout card;
	Button b1,b2,b3;
	public void init()
	{
		card=new CardLayout(200,70);
		setLayout(card);
		b1=new Button("First");
		b2=new Button("Second");
		b3=new Button("Third");


		add(b1,"card1");
		add(b2,"card2");
		add(b3,"card3");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
	card.next(this);
	}

}