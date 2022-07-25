package com.fdmgroup.casting_demo;

public class Cat {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("The cat is eating. ");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}
