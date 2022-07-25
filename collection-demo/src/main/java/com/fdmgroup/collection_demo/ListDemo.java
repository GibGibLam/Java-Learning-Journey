package com.fdmgroup.collection_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		 //  A. ArrayList - resizable array
		List al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.remove(0);
		System.out.println(al);
		
		 // B. LinkedList - internally uses doubly linked list 
			//and it also implements Queue
		List ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.remove(0);
		System.out.println(ll);
		
		 // C. Vector - similar to an ArrayList 
		//but it is synchronized or thread safe hence slower
		List v = new Vector<>();
		v.add(1);
		v.add(2);
		v.remove(0);
		System.out.println(v);
	}
}
