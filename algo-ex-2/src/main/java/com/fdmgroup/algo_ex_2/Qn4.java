package com.fdmgroup.algo_ex_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Qn4 {
	public static void main(String[] args) {
		
		String[] input = new String [] {"eat","tea","tan","ate","nat","bat"};
		String[] input1 = new String [] {"bingos", "boings" , "gibson"};
		String[] input2 = new String [] {"rat", "art", "cat", "fat"};
		System.out.println(anagramMethod(input));
		System.out.println(anagramMethod(input1));
		System.out.println(anagramMethod(input2));
	}

	public static List<List<String>> anagramMethod(String[] string) {

		Map<String, List> result = new HashMap<String, List>();
		for (String s : string) {
			char[] ca = s.toCharArray();
			//sort characters of string to alphabetical order
			Arrays.sort(ca);
			//Convert it to string
			String key = String.valueOf(ca);
			//if hashmap does not contain the characters of string, add to the key with a new arraylist
			if (!result.containsKey(key)) {
				result.put(key, new ArrayList());
			System.out.println(result);}
			//add the strings that fulfills the key or in other words, have the characters in the key 
			//until the result does not contain the characters of the new string
			result.get(key).add(s);
			System.out.println(result);
		}
		System.out.println(result.values());
		//return only the arraylist in the values of the hashmap as part of an arraylist
		return new ArrayList(result.values());
	}
}
