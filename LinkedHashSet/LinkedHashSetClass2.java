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
class LinkedHashSetClass2
{
	public static void main(String[] args)
	{
		LinkedHashSet<Book> list=new LinkedHashSet<Book>();
		Book a=new Book(121,"Alchemist","Paulo Coelho","Penguin",6);
		Book b=new Book(122,"Matilda","Roald Dahl","HC",4);
		Book c=new Book(123,"Harry Potter","J K Rowling","HC",2);

		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println("ID\t\t\tNAME\t\t\t\tAUTHOR\t\t\tPUBLISHER\t\t\tQUANTITY");
		for(Book p:list)
		{
			System.out.println(p.id+"\t\t"+p.name+"\t\t\t"+p.author+"\t\t\t"+p.publisher+"\t"+p.quantity);
		}
		
	}
}