package com.hashmap.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class StreamHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(1, "Himanshu", 1000),
				                                            new Employee(2, "Rahul", 3000),
				                                            new Employee(3, "Sonu", 5000)));
		
		
		Map<Integer,Employee> hashmap = list.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
		
		//System.out.println(hashmap);
		
		//group by name 
		
		Map<String,List<Employee>> hashgroup = list.stream().collect(Collectors.groupingBy(Employee::getName));
		
		System.out.println(hashgroup);
	}

}
