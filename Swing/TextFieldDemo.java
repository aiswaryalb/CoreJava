import java.awt.*;
import javax.swing.*;
public class TextFieldDemo
{
	TextFieldDemo()
	{
		JFrame f=new JFrame();
		JTextArea area=new JTextArea(400,400);
		area.setBounds(100,100,300,300);
		area.setBackground(Color.pink);
		area.setForeground(Color.blue);

		f.add(area);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);


	}
	public static void main(String[] args) {
		new TextFieldDemo();
	}
}