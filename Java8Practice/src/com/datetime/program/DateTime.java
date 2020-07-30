package com.datetime.program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//retuurn the local date 
		LocalDate local = LocalDate.now();
		System.out.println(local);
		
		//return local date and time
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		//return time
		LocalTime time = LocalTime.now();
		System.out.println(time);

	}

}
