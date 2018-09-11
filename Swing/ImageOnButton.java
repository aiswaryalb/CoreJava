import javax.swing.*;
import java.awt.event.*;
public class ImageOnButton
{
	ImageOnButton()
	{
		JFrame f=new JFrame();
		JButton b=new JButton(new ImageIcon("flower.jpg"));
		b.setBounds(60,80,100,100);
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	public static void main(String[] args) {
		new ImageOnButton();
	}
}