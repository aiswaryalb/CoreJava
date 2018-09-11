import java.awt.*;
import java.applet.*;
/*
<applet code="ColorTest" width=200 height =200>
</applet>
*/
public class ColorTest extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.GREEN);
		Color cl=new Color(120,150,67);
		
		g.setColor(cl);
		g.fillRect(40,40,50,70);

		g.setColor(Color.YELLOW);
		g.drawRect(120,110,40,60);

		g.setColor(Color.BLUE);
		g.drawLine(20,0,10,30);

		g.setColor(Color.WHITE);
		g.fillOval(100,40,40,70);

	}
	
}