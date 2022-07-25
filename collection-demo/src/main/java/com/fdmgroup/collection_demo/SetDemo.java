package com.fdmgroup.collection_demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		 // A. TreeSet - sorting and implements SortedSet
		Set savingsAccount = new TreeSet<>();
		
		 // B. HashSet - General purpose collection for storing objects
		//using Hashmap (sort randomly)
		Set currentAccount = new HashSet<>();
		
		
		 // C. LinkedHashSet - maintain insertion order 
		Set checkingAccount = new LinkedHashSet<>();
		
		for (String accountHolder : Arrays.asList("Rachel", "Faiz", "Ryan","Afifi")) {
			savingsAccount.add(accountHolder);
			currentAccount.add(accountHolder);
			checkingAccount.add(accountHolder);
		}
		System.out.println("Savings account: " + savingsAccount);
		System.out.println("Current account: " + currentAccount);
		System.out.println("Checking account:" + checkingAccount);
	}
}
