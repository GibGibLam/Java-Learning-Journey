package com.fdmgroup.generics_demo;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
//		list.add("String");
//		list.add(1);
//		list.add(new Object());
		list.add(new Animal());
		
		Zoo<Animal> zoo = new Zoo<>();
		zoo.printAnimal(new Monkey("Briand"));
		zoo.printAnimal(new Lion("Afifi"));
		
		Zoo<Monkey> monkeyZoo = new Zoo();
		
		//This one should not work because T extends Animal
		Zoo<Trainee> traineeZoo = new Zoo<>();
	}
}
