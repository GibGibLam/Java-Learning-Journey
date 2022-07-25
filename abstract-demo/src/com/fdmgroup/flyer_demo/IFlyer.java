package com.fdmgroup.flyer_demo;

public interface IFlyer {
	void fly();
	
	default void land() {
		System.out.println("Attempting to land...");
	}
}
