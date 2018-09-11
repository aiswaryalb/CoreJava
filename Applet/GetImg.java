import java.awt.*; 
import java.applet.*; 
/*<applet width=500 height=500 code="GetImg">     
</applet>  */   
public class GetImg extends Applet
{
	Image buimg;
	public void init()
	{
		buimg=getImage(getCodeBase(),"flower.jpg");

	}
	public void paint(Graphics g)
	{
		g.drawImage(buimg,60,60,this);
		
	}
}