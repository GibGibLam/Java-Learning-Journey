package com.fdmgroup.collection_demo;

import java.util.HashSet;
import java.util.Set;

public class HashCodeEqualsDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("James Goh", 10_500, 10);
		Employee e2 = new Employee("Gibson Lam", 10_700, 2);
		Employee e3 = new Employee("Faiz Basir", 11_000, 3);
		
		// Hashcode is an int representation of the object
		//memory address by default
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());	
		
		Set employeeHashSet = new HashSet<>();
		employeeHashSet.add(e1);
		employeeHashSet.add(e2);
		employeeHashSet.add(e3);
		
		System.out.println("Hashset contains James Goh: " + employeeHashSet
				.contains(new Employee("James Goh", 10_500, 10)));
	}
}
