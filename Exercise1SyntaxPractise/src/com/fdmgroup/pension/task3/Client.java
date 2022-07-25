package com.fdmgroup.pension.task3;

public class Client {

	public static void main(String[] args) {
		PensionController controller = new PensionController();

		Person[] people = new Person[3];
		people[0] = new Person("John", "Smith", "28/06/1993");
		people[1] = new Person("Jane", "Doe", "05/01/1950");
		people[2] = new Person("Fred", "Bloggs", "12/12/1949");
		
//		Person[] person = {new Person("John", " Smith", "28/06/1993"),
//				new Person("Jane", " Doe", "05/01/1950"),
//				new Person("Fred", " Bloggs", "12/12/1949")};

		controller.handlePensions(people);

	}

}
