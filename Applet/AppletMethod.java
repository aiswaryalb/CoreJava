import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
/*
<applet code="AppletMethod" width=300 height=50>
</applet>
*/
public class AppletMethod extends Applet
{
	public void paint(Graphics g)
	{
		showStatus("This is a status message of an applet window");
		String msg;
		URL url=getCodeBase();
		msg="Code base : "+url.toString();
		g.drawString(msg,10,20);

		url=getDocumentBase();
		msg="Document base : "+url.toString();
		g.drawString(msg,10,60);

	}
	public String getAppletInfo()
	{
		String info="";
		info=info +"GetAppletInfoExample";
		return info;

	}
	
}