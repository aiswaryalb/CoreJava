import javax.swing.*;
public class ComboBoxDemo
{
	ComboBoxDemo()
	{
		JFrame f=new JFrame("Combo box");
		String country[]={"India","Pakistan","Australia","UAE","Malaysia","South Africa"};
		JComboBox cb=new JComboBox(country);
		cb.setBounds(100,150,100,100);

		f.add(cb);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);


	}
	public static void main(String[] args) {
		
		new ComboBoxDemo();
	}
}