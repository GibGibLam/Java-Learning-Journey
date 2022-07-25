package com.fdmgroup.casting_demo;

public class CatApp {
	public static void main(String[] args) {
		Munchkin munchkin = new Munchkin();
		munchkin.setName("Kitty");
		munchkin.setColor("White");

		System.out.println(munchkin);
		munchkin.eat();

		// Upcasting - Implicit because it is safe
		Cat munchkin2 = new Munchkin();

		// Downcasting - Explicit because it is not safe
		Munchkin munchkin3 = (Munchkin) munchkin2;

		Siamese siamese = new Siamese();
//		Cat siamese2 = siamese;

		Siamese siamese3;
		if (munchkin2 instanceof Siamese)
			siamese3 = (Siamese) munchkin2;
		else
			System.out.println("Invalid Instance");

	}
}
