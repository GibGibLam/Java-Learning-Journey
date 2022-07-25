package com.fdmgroup.widening_demo;

public class WideningDemo {
	public static void main(String[] args) {
		byte b = 5;
		go(b);
	}
//if its in byte, it will be short
	//if its a integer, it will be a long
	private static void go(long i) {
		System.out.println("long");
		
	}
	
	private static void go(short i) {
		System.out.println("short");
	}
}
