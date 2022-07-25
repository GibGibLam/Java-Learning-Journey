package com.fdmgroup.students_degree;

import java.util.Date;

public class Profession {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void applyLeave() {
		System.out.println("Applying leave for few days");
	}

	public void applyLeave(int numberDays) {
		System.out.println("Applying leave for " + numberDays + " days");
	}

	public void applyLeave(double hours) {
		System.out.println("Applying leave " + hours + " hours");
	}

	public void applyLeave(Date startDate, Date endDate) {
		System.out.println("Applying leave from" + startDate + "until" + endDate);
	}
}
