import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChooserDemo extends JFrame implements ActionListener
{
	JButton b;
	Container c;
	public ColorChooserDemo()
	{
		 c=getContentPane();
		c.setLayout(new FlowLayout());

		b=new JButton("Color");
		b.addActionListener(this);

		c.add(b);

	}
	public void actionPerformed(ActionEvent ae)
	{
		Color initialcolor=Color.RED;
		Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
		c.setBackground(color);

	}
	public static void main(String[] args) {
		
		ColorChooserDemo ccd=new ColorChooserDemo();
		ccd.setSize(500,500);
		ccd.setVisible(true);
		ccd.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}