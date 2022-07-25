package com.fdmgroup.generics_demo;

public class Zoo <T extends Animal> {

	public void printAnimal(T animal) {
		System.out.println(animal);
	}
}
