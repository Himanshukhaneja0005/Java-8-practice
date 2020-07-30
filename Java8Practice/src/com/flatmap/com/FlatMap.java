package com.flatmap.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static List<Integer> flatmap(List<List<Integer>> list)
	{
		List<Integer> result= list.stream().flatMap(l->l.stream()).collect(Collectors.toList());
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 =  Arrays.asList(5,6,7);
		List<Integer> list2 =  Arrays.asList(1,2,3);
		List<Integer> list3 = Arrays.asList(10,11,12);
		
		List<List<Integer>> flat = Arrays.asList(list1,list2,list3);
		
		List<Integer> result =  flatmap(flat);
		
		result.stream().forEach(System.out::print);

	}

}
