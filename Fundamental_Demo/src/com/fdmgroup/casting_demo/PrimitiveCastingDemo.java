package com.fdmgroup.casting_demo;

public class PrimitiveCastingDemo {
	public static void main(String[] args) {
		double d = 23.45;
		int i = (int) d;
		System.out.println(i);
		
		double d2 = i;
		System.out.println(d2);
		
		//data lost of the 0.45 due to downcasting
	}
}
