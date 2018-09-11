import javax.swing.*;
public class SwingByInheritance extends JFrame
{
	JFrame f;
	SwingByInheritance()
	{
		JButton b=new JButton("Click");
		b.setBounds(50,60,100,50);

		add(b);
		setSize(400,400);
		setLayout(null);
		setVisible(true);

	}
	public static void main(String[] args) {
		new SwingByInheritance();
	}
}