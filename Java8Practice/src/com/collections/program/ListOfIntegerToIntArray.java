package com.collections.program;

import java.util.ArrayList;
import java.util.List;

public class ListOfIntegerToIntArray {

	
	public static int[] convertingListToArray(List<Integer> list)
	{
		//converting list to int array
		int[] arr=list.stream().mapToInt(i->i).toArray();
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(23);
		list.add(55);
		list.add(15);
		list.add(90);
		
		int[] arr = convertingListToArray(list);
		//print all the array element by using for loop
		for(int i :arr)
		{
			System.out.println(i);
		}
		

	}

}
