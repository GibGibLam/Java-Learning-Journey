package com.fdmgroup.pension.task3;

public class Person {

	private String firstname;
	private String lastname;
	private String dateofBirth;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public Person(String firstname, String lastname, String dateofBirth) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofBirth = dateofBirth;
	}

}
