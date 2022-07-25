package com.fdmgroup.generics_demo;

public class Monkey extends Animal{

	private String name;

	public Monkey(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Monkey [name=" + name + "]";
	}
}
