package com.fdmgroup.varargs_demo;

public class TraineeList {
	public static void main(String[] args) {
		printTrainee("List of Trainees", "Afifi", "Faiz", "Hazim", "HongWei", "James");
	}
	//Look at the argument in the method, instead of putting multiple (string, string2...)
	// we use the below argument method to accommodate more arguments
	private static void printTrainee(String... traineeList) {
		for (String trainee : traineeList)
			System.out.println(trainee);
	}
}
