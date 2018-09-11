import java.awt.*; 
import java.applet.*; 
/*<applet width=500 height=500 code="FontDemo">     
</applet>  */   
public class FontDemo extends Applet
{
	public void paint(Graphics g)
	{
		Font f=new Font("TimesRoman",Font.ITALIC,44);
		g.setFont(f);
		g.drawString("My name is Aiswarya B Pillai",20,50);
	}
	
}