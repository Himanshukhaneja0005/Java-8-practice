package com.hashmap.program;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student{
	
	int id;
	String name;
	int salaray;
	
	public Student(int id, String name, int salaray) {
		super();
		this.id = id;
		this.name = name;
		this.salaray = salaray;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaray() {
		return salaray;
	}
	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salaray=" + salaray + "]";
	}
	
}
public class HashMapReturningMap {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "Himanshu", 5000);
		Student s2 = new Student(15, "Rahul", 1000);
		Student s3 = new Student(3, "Anmol", 2000);
		
		Map<Integer,Student> hashmap =  new HashMap<Integer, Student>();
		hashmap.put(65, s1);
		hashmap.put(75, s2);
		hashmap.put(85, s3);
		
		Map<Integer,Student> map=hashmap.entrySet().stream().filter(i->i.getKey()>=65).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		//print the map before java 8
		/*for(Map.Entry<Integer, Student> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}*/
		
		//print map using 8
		//map.forEach((k,v)->System.out.println(k+" "+v));
		
		//print map using stream foreach java 8
		map.entrySet().stream().forEach(System.out::println);

	}

}
