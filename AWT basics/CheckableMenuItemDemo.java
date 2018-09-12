import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MenuFrame extends Frame
{
	String msg=" ";
	MenuFrame(String title)
	{
		super(title);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		Menu edit=new Menu("Edit");

		MenuItem item6,item7,item8,item9;
		edit.add(item6=new MenuItem("Cut"));
		edit.add(item7=new MenuItem("Copy"));
		edit.add(item8=new MenuItem("Paste"));
		item8.setEnabled(false);
		edit.add(item9=new MenuItem("-"));

		Menu sub=new Menu("Special");
		MenuItem item10,item11,item12;
		sub.add(item10=new MenuItem("First"));
		sub.add(item11=new MenuItem("Second"));
		sub.add(item12=new MenuItem("Third"));

		edit.add(sub);

		CheckboxMenuItem debug,test;
		debug=new CheckboxMenuItem("Debug");
		edit.add(debug);
		test=new CheckboxMenuItem("Testing");
		edit.add(test);
		mbar.add(edit);


	}

}
public class CheckableMenuItemDemo
{
	public static void main(String[] args) 
	{

		Frame f;
		f=new MenuFrame("Menu Demo");
		f.setSize(200,200);
		f.setVisible(true);
		
	}
}