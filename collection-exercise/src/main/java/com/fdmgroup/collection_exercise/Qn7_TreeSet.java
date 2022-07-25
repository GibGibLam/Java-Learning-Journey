package com.fdmgroup.collection_exercise;

import java.util.Set;
import java.util.TreeSet;

public class Qn7_TreeSet {

//	7)	Write a method that uses a String method split 
//to tokenize a line of text input by the user 
//and places each token in a TreeSet. 
//It should return the TreeSet. 
//Note: Printing the TreeSet should output the elements ascending sorted order.
	
	public static void main(String[] args) {
		String input = "Hello there, it is late and i want to sleep";
		tokenInput(input);
	}
	
	public static Set<String> tokenInput(String input) {
		Set tokenizeInput = new TreeSet<>();
		String[] splitted = input.split("\\s+");
		for(String Inputs: splitted) {
			tokenizeInput.add(Inputs);
		}
		System.out.println(tokenizeInput);
		return tokenizeInput;
	}

}
