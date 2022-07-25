package com.fdmgroup.datetime_demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeAPIDemo {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate myLocalDate = LocalDate.of(2020, 03, 15);
		System.out.println(myLocalDate.getMonthValue());
		
		//Challenge - get the period between current date and march 15 2020
		Period period = Period.between(myLocalDate, LocalDate.now());
		System.out.println(period);
		Period periods = Period.between(LocalDate.now(), myLocalDate);
		System.out.println(periods);
	}	
}
