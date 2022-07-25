package com.fdmgroup.collection_demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		// A. LinkedList - internally uses doubly linked list 
		// and it also implements list 
		Queue ll = new LinkedList<>();
		ll.add("1"); 
		ll.add("2");
		ll.add("3");
		System.out.println(ll.peek()); // retrieves head of queue
		System.out.println(ll.poll()); //removes head of queue
		System.out.println(ll.peek());
		System.out.println(ll);
		
	    // B. PriorityQueue - uses FIFO (first in last out) all and elements are sorted 
		// as per their natural order by default
		Queue pq = new PriorityQueue<>();
		pq.add(1_000);
		pq.add(10);
		pq.add(10_000);
		pq.add(3);
		pq.add(100);
		pq.add(1);
		System.out.println(pq);
		
		while (!pq.isEmpty())
			System.out.println(pq.poll());
	}
}
