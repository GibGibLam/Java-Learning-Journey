package com.fdmgroup.collection_exercise;

import java.util.HashMap;
import java.util.Map;

public class Qn4_HelloThere {

	// 4) Write a method to count the number of occurrences of each letter in a
	// string.
	// For example, the string "HELLO THERE" contains two Hs, three Es, two Ls, one
	// O, one T and one R.
	// It should return an object that contains the results – what kind of class is
	// best suited for this?
	public static void countOccurence(String word) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = word.toCharArray();
		for (char c : strArray) {
			if (c != ' ') {
				if (charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c) + 1);
				} else {
					charCountMap.put(c, 1);
				}
			}

		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
