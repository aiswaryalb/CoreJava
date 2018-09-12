import java.io.*;

import java.awt.*;
class LabelDemo extends Frame
{
	LabelDemo()
	{

		super("Example");
		setLayout(new FlowLayout());
		setSize(200,200);
		Label one=new Label("One");
		Label two=new Label("Two");
		Label three=new Label("Three");
		add(one);
		add(two);
		add(three);
		setVisible(true);

	}
}

class LabelEg
{
	public static void main(String[] args) 
	{

			LabelDemo obj=new LabelDemo();
		
	}
}