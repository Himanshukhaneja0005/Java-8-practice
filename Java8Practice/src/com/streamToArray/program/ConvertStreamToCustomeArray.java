package com.streamToArray.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book{
	
	public String Author;
	public int price;
	
	public Book(String author, int price) {
		super();
		Author = author;
		this.price = price;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Author=" + Author + ", price=" + price + "]";
	}
	
	
}

public class ConvertStreamToCustomeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1= new Book("Himanshu", 10);
		Book b2 = new Book("Ajay", 20);
		Book b3 = new Book("Rahul",10 );
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		Book[]  book = list.stream().filter(b->b.price==10).toArray(Book[]::new);
		
		//print array of books that contain price equal to 10
		System.out.println(Arrays.toString(book));
		/*for(Book i : book)
		{
			System.out.println(i.getAuthor()+" "+i.getPrice());
		}*/
	}

}
