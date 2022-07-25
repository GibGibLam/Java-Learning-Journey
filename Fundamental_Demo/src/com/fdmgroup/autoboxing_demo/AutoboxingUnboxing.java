package com.fdmgroup.autoboxing_demo;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		//1. WHen we are assigning a primitive type to its corresponding Wrapper type
		Integer i = 0;
		Character c = 'c';
		
		//Before Java 1.5
		Integer i2 = new Integer(0);
		Character c2 = new Character('c');
		
		//2. When we are passing a primitive type as an argument to a method that is
		//expecting a reference type
		printSomething(3);
		
	}

	private static void printSomething(Integer i) {
		System.out.println(i);
		
	}
}
