package com.fdmgroup.design_pattern_exercise;

import java.util.ArrayList;
import java.util.List;

public class UserArrayListStorage implements IStorage {
	User user;
	List<User> userList = new ArrayList<User>();
	int i = 0;

	@Override
	public void create(User user) {
		userList.add(user);
		user.setId(i);
		i += 1;
		System.out.println(user.getUsername() + " has been created successfully!");
		System.out.println("Your User id is " + user.getId());
	}

	@Override
	public User read(int id) {
		System.out.println(id);
		for (User u : userList)
			if (u.getId() == id) {
				System.out.println(u.getUsername());
				System.out.println(u.getPassword());
				System.out.println("User id " + id + " details are as follows --> [Name: " + u.getUsername()
						+ "] [Password: " + u.getPassword() + "] [Email: " + u.getEmail() + "]");
				return u;
			}
		return null;
	}

	@Override
	public void update(User updatedUser) {
		for (User u : userList)
			if (u.getId() == updatedUser.getId())
				userList.set(userList.indexOf(u), updatedUser);
		System.out.println(updatedUser.getUsername() + " has been updated successfully!");
		System.out.println("User details are as follows: " + updatedUser.getUsername() + " " + updatedUser.getId() + " "
				+ updatedUser.getPassword() + " " + updatedUser.getEmail());

	}

	// Deletes user via the id
	@Override
	public void delete(int id) {
		for (User u : userList)
			if (id == u.getId()) {
				System.out.println(u.getUsername() + " has been removed successfully");
				userList.remove(userList.indexOf(u));
			}
	}

	@Override
	public List<User> readAll() {
		for (User u : userList) {
			System.out.println(u.getId() + " " + u.getUsername());
		}
		return userList;
	}

}
