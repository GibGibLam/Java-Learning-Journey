package com.fdmgroup.pension.task3;

public class PensionLogic {

	public boolean isPensionable(Person person, String year) {
		String date = person.getDateofBirth();
//		String delim = "/";
//		String[] token = date.split(delim);

		int personYear = Integer.parseInt(date.split("/")[2]);

		int compareYear = Integer.parseInt(year);

		return (compareYear - personYear >= 65);

	}

}