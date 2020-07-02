package com.collections.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfIntegerToListOfInteger {

	
	public static List<Integer> ListInteger(List<Integer> list)
	{
		//converting list of Integer to int array
		
		int[] arr=list.stream().mapToInt(Integer::intValue).toArray();
		
		//convverting int array to List of integer
		
		List<Integer> lis=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		
		return lis;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(13);
		list.add(60);
		list.add(1);
		
		List<Integer> lis=ListInteger(list);
		System.out.println("Before Sorting");
		//print all the list element by using forEach loop using Method Refrence
		
		lis.stream().forEach(System.out::println);
		
		/*//print all the list elemet by using the lambda expression
		lis.stream().forEach(s->System.out.println(s));
		*/
		

	}

}
