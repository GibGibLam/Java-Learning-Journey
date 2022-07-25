package com.fdmgroup.students_degree;

public class MechanicalEngineer extends Profession {
	// private disallow access of the string from another class
	// see professionapp class

	private String thermoFluids;
	private String dynamics;

	public String getThermoFluids() {
		return thermoFluids;
	}

	public void setThermoFluids(String thermoFluids) {
		this.thermoFluids = thermoFluids;
	}

	public String getDynamics() {
		return dynamics;
	}

	public void setDynamics(String dynamics) {
		this.dynamics = dynamics;
	}

	public void maintainMachine() {
		System.out.println("Maintaining the machine");
	}

	// to override from the profession class
	@Override
	public void applyLeave() {
		System.out.println("Enjoy your holiday!");
	}

	
}
