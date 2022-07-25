package com.fdmgroup.animal_app;

public abstract class Animal {
	private String name;
	private double weight;

	public abstract void hunting();
	
	public void eating() {
		System.out.println("The animal is eating.");
	}
}
