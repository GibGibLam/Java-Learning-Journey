package com.fdmgroup.exception_demo;

import java.util.Scanner;

public class MyExceptionApp {

	public static void main(String[] args) {
		System.out.println("Welcome to our fabulous exception test!");
		System.out.println("Please enter your selection from 1 to 8");
		System.out.println("1 - MyFirstException");
		System.out.println("2 - MySecondException");
		System.out.println("3 - MyThirdException");
		System.out.println("4 - NumberFormatException");
		//When casting check that the variable is the correct datatype
		System.out.println("5 - ClassCastException");
		//When passed a reference variable as input check if it is null
		System.out.println("6 - NullPointerException");
		//When doing division check that the divisor is not 0
		System.out.println("7 - ArithmeticException");
		//When accessing arrays, check that the index is within the array bounds
		System.out.println("8 - IndexOutOfBoundsException");
		System.out.println("q - Exit the application.");
		
		//creates a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//has a next option
		while (scanner.hasNext()) {
			// allow for the input
			String option = scanner.nextLine();
			if (option.equals("q")) {
				System.out.println("Thank you for using our fabulous app. See you next time!");
				break;
			} else {
				int selection = Integer.parseInt(option);
				handle(selection);
			}
		}
	}

	private static void handle(int selection) {
		try {
			exceptionTester(selection);
			// To demo that two exceptions can be placed tgt, in actual fact we can put all 3 tgt while
			//the other runtime can be put tgt in one line
		} catch (MyFirstException | MySecondException e) {
			System.out.println("My exception message = " + e.getMessage());
		} catch (MyThirdException e) {
			System.out.println("My exception message = " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Runtime exception message = " + e.getMessage());
		} catch (ClassCastException e) {
			System.out.println("Runtime exception message = " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Runtime exception message = " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Runtime exception message = " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Runtime exception message = " + e.getMessage());
			//finally executes after every catch message
		} finally {
			System.out.println("Successfully handled");
		}
	}

	private static void exceptionTester(int selection) throws MyFirstException, MySecondException, MyThirdException {
		switch (selection) {
		case 1:
			System.out.println("Throwing MyException Type 1");
			throw new MyFirstException("This is my first exception.");
		case 2:
			System.out.println("Throwing MyException Type 2");
			throw new MySecondException("This is my second exception.");
		case 3:
			System.out.println("Throwing MyException Type 3");
			throw new MyThirdException("This is my third exception.");
		case 4:
			System.out.println("Throwing NumberFormatException");
			String myString = "one";
			Integer.parseInt(myString);
		case 5:
			System.out.println("Throwing ClassCastException");
			Exception exception = new Exception();
			MyFirstException firstException = (MyFirstException) exception;
		case 6:
			System.out.println("Throwing NullPointerException");
			MyFirstException myFirstException = null;
			myFirstException.getMessage();
		case 7:
			System.out.println("Throwing an ArithmeticException");
			double result = 4 / 0;
		case 8:
			System.out.println("Throwing an IndexOutOfBoundsException");
			int[] intArray = new int[3];
			intArray[3] = 4;

		}

	}
}
