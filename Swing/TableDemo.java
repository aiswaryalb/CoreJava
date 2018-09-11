import javax.swing.*;
public class TableDemo
{
	TableDemo()
	{
		JFrame f=new JFrame();
		String data[][]={{"100","Aiswarya","22"},{"101","Angel","21"},{"102","Meenu","22"},{"103","Priya","26"},{"104","Gayathri","32"}};
		String column[]={"ID","NAME","AGE"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);

		
		f.setSize(100,100);
		//f.setLayout(null);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		
		new TableDemo();
	}
}