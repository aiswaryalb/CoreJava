import javax.swing.*;
import java.awt.*;
public class DisplayImage extends Canvas
{
	public void paint(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("cat.gif");
		g.drawImage(i,120,100,this);
	}

	public static void main(String[] args) {
		DisplayImage img=new DisplayImage();
		JFrame f=new JFrame();
		f.add(img);
		f.setSize(400,400);
		f.setVisible(true);
	}
}