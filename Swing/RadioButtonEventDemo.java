import javax.swing.*;
import java.awt.event.*;
public class RadioButtonEventDemo extends JFrame implements ActionListener
{
	JRadioButton r1,r2;
	JButton b;
	RadioButtonEventDemo()
	{
		r1=new JRadioButton("A)Male");
		r2=new JRadioButton("B)Female");
		r1.setBounds(100,50,100,50);
		r2.setBounds(100,100,100,50);

		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		b=new JButton("Click");
		b.setBounds(100,150,100,50);

		b.addActionListener(this);

		add(r1);
		add(r2);
		add(b);

		setSize(500,500);
		setLayout(null);
		setVisible(true);


	}
	public void actionPerformed(ActionEvent ae)
	{
		if(r1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are male");
		}
		if (r2.isSelected()) 
		{
			JOptionPane.showMessageDialog(this,"You are female");
			
		}

	}
	public static void main(String[] args) {
		
		new RadioButtonEventDemo();
	}
}