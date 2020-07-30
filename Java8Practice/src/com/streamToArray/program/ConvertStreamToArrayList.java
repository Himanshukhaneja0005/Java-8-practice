package com.streamToArray.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Books{
	
	public String Author;
	public int price;
	
	public Books(String author, int price) {
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
		return "Books [Author=" + Author + ", price=" + price + "]";
	}
	
	
}

public class ConvertStreamToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books b1= new Books("Himanshu", 10);
		Books b2 = new Books("Ajay", 20);
		Books b3 = new Books("Rahul",10 );
		Books b4 = new Books("Hemant",50);
		List<Books> list = new ArrayList<Books>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		List<Books> arraylist = list.stream().filter(i->i.getAuthor().startsWith("H")).collect(Collectors.toList());
		
		//print the list using method refrence foreach
		arraylist.stream().forEach(System.out::println);
		//arraylist.stream().forEach(i->System.out.println(i));
		
		/*for(Books b:arraylist)
		{
			System.out.println(b.getAuthor()+" "+b.getPrice());
		}
		*/

		//System.out.println(arraylist);
	}

}
