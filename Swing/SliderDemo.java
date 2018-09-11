import javax.swing.*;
public class SliderDemo extends JFrame
{
	public SliderDemo()
	{
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);
	}
	public static void main(String[] args) {
		
		SliderDemo frame= new SliderDemo();
		frame.pack();
		frame.setVisible(true);
	}
}