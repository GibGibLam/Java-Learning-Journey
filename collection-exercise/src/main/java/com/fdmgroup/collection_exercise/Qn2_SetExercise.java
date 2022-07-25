package com.fdmgroup.collection_exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Qn2_SetExercise {
	//Write a method that reads in a series of first names and eliminates duplicates by storing them in a Set. It should return the Set.
	

	public Set setMethod(String...name) {
		Set setName = new HashSet<>();
		for(String Name: Arrays.asList(name)) {
		setName.add(Name);
		}
		System.out.println(setName);
		return setName;
		
	}
	
	

}
