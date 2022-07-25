package com.fdmgroup.design_pattern_exercise;

public class UserManager {

	public static void main(String[] args) {
		
		IStorage userStorage = StorageFactory.getStorage();
		User user1 = new User("Gibson", "pw","gib@java.com");
		User user2 = new User("Ryan", "wp", "R@java.com");
		userStorage.create(user1);
		userStorage.create(user2);
		userStorage.read(0);
		user1 = new User("Gibson", "pw123", "gib@java.com");
		userStorage.update(user1);
		userStorage.readAll();
		userStorage.delete(0);
		userStorage.readAll();
	}
	

}
