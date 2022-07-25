package com.fdmgroup.collection_demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		 // A. Hashmap - implemented as Hashtable
		//and there is no order of keys
			Employee e1 = new Employee("James Goh", 10_500, 10);
			Employee e2 = new Employee("Gibson Lam", 10_700, 2);
			Employee e3 = new Employee("Faiz Basir", 11_000, 3);
			
			Map<Employee, Integer> employeeHashmap = new HashMap<>();
			employeeHashmap.put(e1, 24);
			employeeHashmap.put(e2, 25);
			employeeHashmap.put(e3, 19);
			
			System.out.println("HashMap size: " + employeeHashmap.size());
			employeeHashmap.forEach((k,v) -> System.out.println(k + ":" + v));
			
		 // B. Treemap - ordered by keys
			Map<Employee, Integer> employeeTreemap = new TreeMap<>();
			employeeTreemap.put(e1, 24);
			employeeTreemap.put(e2, 25);
			employeeTreemap.put(e3, 19);
			
			System.out.println("TreeMap size: " + employeeTreemap.size());
			employeeTreemap.forEach((k,v) -> System.out.println(k + ":" + v));
			
		 // C. LinkedHashmap - maintains the insertion key sort
			Map<Employee, Integer> employeeLinkedHashMap = new LinkedHashMap<>();
			employeeLinkedHashMap.put(e1, 24);
			employeeLinkedHashMap.put(e2, 25);
			employeeLinkedHashMap.put(e3, 19);
			
			System.out.println("LinkedHashMap size: " + employeeLinkedHashMap.size());
			employeeLinkedHashMap.forEach((k,v) -> System.out.println(k + ":" + v));
		
		 // D. Hashtable - thread safe/synchronized version of Hashmap
			Map<Employee, Integer> employeeHashtable = new Hashtable<>();
			employeeHashtable.put(e1, 24);
			employeeHashtable.put(e2, 25);
			employeeHashtable.put(e3, 19);
			
			System.out.println("HashTable size: " + employeeHashtable.size());
			employeeHashtable.forEach((k,v) -> System.out.println(k + ":" + v));
		
			
	}
}
