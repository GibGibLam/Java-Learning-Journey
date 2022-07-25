package com.fdmgroup.flyer_demo;

public class CommercialPlane extends Airplane {

	@Override
	public void refuel() {
		System.out.println("The plane is refueling...");
		
	}

	@Override
	public void fly() {
		System.out.println("The plane is flying...");
		
	}

	@Override
	void crash() {
	System.out.println("Mayday...Plane is crashing...MAYDAY!!!");
	}

	
}
