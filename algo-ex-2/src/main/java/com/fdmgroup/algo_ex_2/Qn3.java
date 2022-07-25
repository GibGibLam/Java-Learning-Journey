package com.fdmgroup.algo_ex_2;

public class Qn3 {
	public static void main(String[] args) {
		int noOfSteps = 4;
		System.out.println(frogJumping(noOfSteps));
	}
	public static int frogJumping(int n) {
		
		
		return fibMethod(n + 1);

	}
	
	private static int fibMethod(int n) {
		
		if (n <= 1)
			return n;
		else
			return fibMethod(n - 1) + fibMethod(n-2);

	}
}
