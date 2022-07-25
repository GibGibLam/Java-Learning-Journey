package com.fdmgroup.pension.task3;

public class View {

	public void printEligible(Person person) {
		System.out.println(person.getFirstname() + " " + person.getLastname() + " may qualify for a pension this year");
		
	}
	
	public void printIneligible(Person person) {
		System.out.println(person.getFirstname() + " " + person.getLastname() + " is not old enough yet");
		
	}
}
