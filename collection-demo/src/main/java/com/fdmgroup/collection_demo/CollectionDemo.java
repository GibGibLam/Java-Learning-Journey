package com.fdmgroup.collection_demo;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		// Array - size is immutable / fix
		int[] num = new int[5];
		int[] num2 = { 1, 2, 3, 4, 5 };

		// List - size mutable and more functionalities
		List list = new ArrayList<>();
		list.add("Afifi");
		list.add("James");
		list.add("Ryan");
		System.out.println(list);

		list.remove(0);
		System.out.println(list);
		/*
		 * 1. List - ordered sequence of elements where duplicates are allowed, and we
		 * can access elements through index 
		 * A. ArrayList 
		 * B. LinkedList 
		 * C. Vector
		 * 
		 * 2. Queue - ordered FIFO/LIFO data structure 
		 * A. LinkedList 
		 * B. PriorityQueue
		 * 
		 * 3. Set - unique/ no duplicates 
		 * A. TreeSet 
		 * B. HashSet 
		 * C. LinkedHashSet
		 * 
		 * 4. Map - It doesn't implements Collections, key-value pair data structure, no
		 * duplicate keys
		 * A. Hashmap
		 * B. Treemap
		 * C. LinkedHashmap
		 * D. Hashtable
		 * 
		 */

	}
}
