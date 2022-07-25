package com.fdmgroup.constructor_demo;

public class Food {

	String name;
	String texture;
	
	public Food(String name, String texture) {
		this.name = name;
		this.texture = texture;
	}
	
	public Food() {
		
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", texture=" + texture + "]";
	}
}
