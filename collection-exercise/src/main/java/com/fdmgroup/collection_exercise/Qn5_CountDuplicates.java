package com.fdmgroup.collection_exercise;

import java.util.HashSet;
import java.util.Set;

public class Qn5_CountDuplicates {

//	5)	Write a method that returns the number of duplicate words in a sentence. 
//Treat uppercase and lowercase letters the same. Ignore punctuation.

	public int CountDup(String sentence) {
		int count = 0;
		String[] words = sentence.split("\\s+");

		Set<String> unique = new HashSet<>();

		for (String word : words) {
			if (!unique.add(word)) {
				count += 1;
			}

		}
		System.out.println(count);
		return count;
	}
}
