package com.fdmgroup.collection_exercise;

import java.util.PriorityQueue;
import java.util.Queue;

public class Qn8_PriorityQueue {

//	8)	Create a method that takes in a variable argument of type double and returns a PriorityQueue 
//that orders the doubles in descending order (i.e., 14.8 should be the highest-priority element rather than 2.2)
	public static void main(String[] args) {
		double object = 1;
		double object2 = 2;
		double object3 = 3;
		convertQueue(object, object2, object3);
		
	}
	public static Queue<Object> convertQueue(double...object) {
		Queue<Object> pq = new PriorityQueue<>();
		for(double Objects : object)
		{
			pq.add(Objects);
		}
		
		Queue<Object> descPQ = new PriorityQueue<>();
		descPQ.add(pq.poll());
		System.out.println(descPQ);
		return descPQ;
	}
}
