package com.hashmap.program;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class HashMapReturningString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "Himanshu");
		map.put(50, "Rahul");
		map.put(13, "Anmol");
		
		String reuslt = map.entrySet().stream().filter(i->i.getKey()==10).map(m->m.getValue().toUpperCase()).collect(Collectors.joining());
		
		System.out.println(reuslt);

	}

}
