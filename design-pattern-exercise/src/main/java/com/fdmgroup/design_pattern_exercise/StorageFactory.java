package com.fdmgroup.design_pattern_exercise;

public class StorageFactory {

	public static IStorage getStorage() {
		UserArrayListStorage userArrayListStorage = new UserArrayListStorage();
		return userArrayListStorage;
	}

}
