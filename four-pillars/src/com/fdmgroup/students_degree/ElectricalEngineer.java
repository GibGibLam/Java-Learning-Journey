package com.fdmgroup.students_degree;

public class ElectricalEngineer extends Profession{

	private String circuit;
	private String mathematics;
	
	public String getCircuit() {
		return circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	public String getMathematics() {
		return mathematics;
	}

	public void setMathematics(String mathematics) {
		this.mathematics = mathematics;
	}

	public void calculateCurrentFlow() {
		System.out.println("Calculating current flow");
	}
	
	
	
}
