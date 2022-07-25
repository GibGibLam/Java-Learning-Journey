package com.fdmgroup.generics_exercise;

public class Pair<T extends First,X extends	 Second> {
	
	private void pairMethod(T first, X second) {
		System.out.println(first);
		System.out.println(second);

	}
}
