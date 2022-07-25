package com.fdmgroup.fizzbuzz.task2;

public class FizzBuzzRunner {
	// Inside FizzBuzzRunner, create a method called fizzBuzz that takes an int and
	// returns no value.

	public void fizzBuzz(int number) {
		for (int i = 1; i <= number; i++) {

			if (fizzbuzz(i) == true) {
				System.out.println("FizzBuzz");
			} else if (fizz(i) == true) {
				System.out.println("Fizz");
			} else if (buzz(i) == true) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

	private boolean fizz(int num) {
		return (num % 3 == 0);

	}
	// Takes a number and, if a multiple of 3, returns true, otherwise returns
	// false:

	private boolean buzz(int num) {
		return (num % 5 == 0);

	}
	// Takes a number and, if a multiple of 5, returns true, otherwise returns
	// false:

	private boolean fizzbuzz(int num) {
		return (num % 15 == 0); 	
	}

}
