package com.string.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"himanshu","Khaneja"};
		
		
		List<String> strlist =Arrays.asList(str);
		
		List<String> list = strlist.stream().map(String :: toUpperCase).collect(Collectors.toList());
		
		
		list.stream().forEach(System.out::println);
		
	
		
				

	}

}
