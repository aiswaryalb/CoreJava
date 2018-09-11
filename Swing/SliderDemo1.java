import javax.swing.*;
public class SliderDemo1 extends JFrame
{
	public SliderDemo1()
	{
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);

		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);


	}
	public static void main(String[] args) {
		SliderDemo1 frame=new SliderDemo1();
		frame.pack();
		frame.setVisible(true);

	}
}