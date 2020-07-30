package com.InterfaceWithLambad.program;

interface Add{
	int add(int a, int b);
}

public class Himanshu {
	
	public static void main(String args[])
	{
		
		Add add =(a,b)->{
			return a+b;
			
		};
		
		System.out.println(add.add(5, 10));
		
	}



}
