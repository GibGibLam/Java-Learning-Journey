package com.fdmgroup.flyer_demo;

public class AirplaneApp {
	public static void main(String[] args) {
		CommercialPlane cp = new CommercialPlane();
		cp.refuel();
		cp.fly();
		cp.land();
		cp.crash();
	}
}
