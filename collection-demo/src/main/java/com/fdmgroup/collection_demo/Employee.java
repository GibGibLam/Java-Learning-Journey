package com.fdmgroup.collection_demo;

public class Employee implements Comparable<Employee> {

	private String name;
	private double salary;
	private int id;

	public Employee(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee o) {
//			return this.id - o.getId();
		return (int) (this.salary - o.getSalary());
//			return this.name - o.getName();
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Employee) obj).getId())
			return true;
		return false;
	}

}
