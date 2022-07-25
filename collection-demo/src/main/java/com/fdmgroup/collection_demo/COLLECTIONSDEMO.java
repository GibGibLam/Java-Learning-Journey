package com.fdmgroup.collection_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class COLLECTIONSDEMO {

	public static void main(String[] args) {
		List al = new ArrayList<>();
		al.add(100);
		al.add(7);
		al.add(6);
		
		Collections.sort(al);
		System.out.println("Sorted: " + al);
		
		Collections.reverse(al);
		System.out.println("Reverse: " + al);
		
		System.out.println("Max: " + Collections.max(al));
		System.out.println("Min: " + Collections.min(al));
	}
}
