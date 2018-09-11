/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.awt.*;
package awt;

/**
 *
 * @author Aiswarya
 */
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

class AWT
{
	public static void main(String[] args) 
	{

			LabelDemo obj=new LabelDemo();
		
	}
}
