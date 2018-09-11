import java.io.*;
import java.util.*;
class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name, String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
}
class HashSetClass2
{
	public static void main(String[] args)
	{
		HashSet<Book> list=new HashSet<Book>();
		Book a=new Book(121,"Alchemist","Paulo Coelho","Penguin",6);
		Book b=new Book(122,"Matilda","Roald Dahl","HC",4);
		Book c=new Book(123,"Harry Potter","Rowling","HC",2);

		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println("ID\t\tNAME"+"\t"+"    \tAUTHOR\t\t\tPUBLISHER"+"    "+"QUANTITY");
		for(Book p:list)
		{
			System.out.println(p.id+"\t\t"+p.name+"    \t"+p.author+"\t\t\t"+p.publisher+"\t\t"+p.quantity);
		}
		
	}
}