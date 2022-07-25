package com.fdmgroup.students_degree;

public class ProfessionApp {
	public static void main(String[] args) {
		MechanicalEngineer engineer = new MechanicalEngineer();
		engineer.setName("Hongwei Chow");
		System.out.println(engineer.getName());
	
		engineer.applyLeave();
		engineer.applyLeave(14);
		engineer.applyLeave(3.0);
	}
}
