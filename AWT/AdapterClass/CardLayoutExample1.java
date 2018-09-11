import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CardLayoutExample1" width=300 height=300>
</applet>

*/
public class CardLayoutExample1 extends Applet implements ActionListener
{
	Panel cardPanel;
	Panel firstP,secondP,thirdP;
	Panel buttonP;
	Button first,second,third;
	CardLayout ourLayout;
	public void init()
	{
		cardPanel=new Panel();
		ourLayout=new CardLayout();
		cardPanel.setLayout(ourLayout);
		firstP=new Panel();
		firstP.setBackground(Color.blue);
		secondP=new Panel();
		secondP.setBackground(Color.yellow);
		thirdP=new Panel();
		thirdP.setBackground(Color.green);


		first=new Button("First");
		first.addActionListener(this);
		second=new Button("Second");
		second.addActionListener(this);
		third=new Button("Third");
		third.addActionListener(this);



		buttonP=new Panel();
		buttonP.add(first);
		buttonP.add(second);
		buttonP.add(third);


		this.setLayout(new BorderLayout());
		this.add(buttonP,BorderLayout.SOUTH);
		this.add(cardPanel,BorderLayout.CENTER);

		cardPanel.add(firstP,"First");
		cardPanel.add(secondP,"Second");
		cardPanel.add(thirdP,"Third");
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==first)
			ourLayout.show(cardPanel,"First");

		if(e.getSource()==second)
			ourLayout.show(cardPanel,"Second");

		if(e.getSource()==third)
			ourLayout.show(cardPanel,"Third");

	}

}