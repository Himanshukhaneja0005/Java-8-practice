package com.collections.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book {
	
	String author;
	String title;
	int price;
	
	
	public Book(String author, String title, int price) {
		super();
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
 public class Sorting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> list = new ArrayList<>();
		list.add(new Book("Himanshu","Love At Fisrt Site",20));
		list.add(new Book("Bharat", "Love", 500));
		list.add(new Book("Ajay", "Magic", 10));
		list.add(null);
		
		System.out.println("Before Sorting using Coampartor in java 8");
		//print the list of elements by using Method Refrence in java 8
		list.stream().forEach(System.out::println);
		
		/*
		//Java 8 comparator using Lambda Expression
		Comparator<Book> book=(b1,b2)->b1.getAuthor().compareTo(b2.getAuthor());
		list.sort(book);
		*/
		
		/*
		//java 8 comparator using Method reference or we called as :: operator
		Comparator<Book> book = Comparator.comparing(Book::getPrice);
		list.sort(book);
	    //we can sort the above Method reference using shortcut direct passing into list.sort function
		list.sort(Comparator.comparing(Book::getPrice));
		*/
		
		/*
		//java 8 comparator using method reference to compare multiple fields
		Comparator<Book> book = Comparator.comparing(Book::getAuthor).thenComparing(Book::getPrice);
		list.sort(book);
		//we can pass the above Method reference for comparing Multiple fields into list.sort function
		list.sort(Comparator.comparing(Book::getAuthor).thenComparing(Book::getPrice));
		*/
		
		/*
		// java 8 comparator using method reference to compare in reverse order
		list.sort(Comparator.comparing(Book::getPrice).reversed());
		*/
		
		//java 8 comparator using NullFirst and NullLast function 
		Comparator<Book> book = Comparator.comparing(Book::getPrice);
		list.sort(Comparator.nullsFirst(book));
		
		System.out.println("After Sorting Using Compartor in Java 8");
		//Print the list of element by using Lambda expression
		list.stream().forEach(i->System.out.println(i));
		
		
		

	}

}
