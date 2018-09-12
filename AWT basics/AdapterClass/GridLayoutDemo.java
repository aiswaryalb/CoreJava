import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*

<applet code="GridLayoutDemo" width=300 height=300>
</applet>
*/
public class GridLayoutDemo extends Applet
{
	static final int n=4;
	public void init()
	{
		setLayout(new GridLayout(n,n));
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int k=i*n+j;
				if(k>0)
				add(new Button(""+k));
			}
		}
	}


}