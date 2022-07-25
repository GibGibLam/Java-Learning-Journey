package com.fdmgroup.generics_demo;

public class Lion extends Animal{
	private String name;

	public Lion(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Lion [name=" + name + "]";
	}

}
