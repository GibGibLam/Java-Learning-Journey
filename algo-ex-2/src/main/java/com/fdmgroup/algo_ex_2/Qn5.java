package com.fdmgroup.algo_ex_2;

public class Qn5 {
	public static void main(String[] args) {
		// test for 6 characters (false)
		String password = "Qwe1#$";
		System.out.println(password);
		System.out.println(validPassword(password));
		// test for 7 characters (true)
		String password1 = "Qwer1@y";
		System.out.println(password1);
		System.out.println(validPassword(password1));
		// test for no upper case(true)
		String password2 = "qwer1@y";
		System.out.println(password2);
		System.out.println(validPassword(password2));
		// test for no lower case(true)
		String password3 = "QWER1@y";
		System.out.println(password3);
		System.out.println(validPassword(password3));
		// test for no number(true)
		String password4 = "Qwert@y";
		System.out.println(password4);
		System.out.println(validPassword(password4));
		// test for no symbol(true)
		String password5 = "Qwer1ty";
		System.out.println(password5);
		System.out.println(validPassword(password5));
		// test for more than 7 characters(true)
		String password6 = "Asd#$%12345";
		System.out.println(password6);
		System.out.println(validPassword(password6));
		// test only symbol(false)
		String password7 = "!@#$^&**";
		System.out.println(password7);
		System.out.println(validPassword(password7));
		// test only numbers(false)
		String password8 = "1234567";
		System.out.println(password8);
		System.out.println(validPassword(password8));
	}

	// test upper, lower, number,symbol and 7 or more char
	public static boolean validPassword(String password) {
		int valid = 0;
		if (password.length() >= 7) {
			if (password.toUpperCase() != password) {
				valid++;
			}
			if (password.toLowerCase() != password) {
				valid++;
			}
			if (password.matches("(.*[@,#,$,%].*$)")) {
				valid++;
			}
			if (password.matches("(.*[0-9].*)")) {
				valid++;
			}

			if (valid >= 3) {
				System.out.println("Password is valid!");
				return true;
			}
		} else {
			System.out.println("Password has only " + password.length() + " characters . " + "Please input at least 7 characters.");
			return false;
		}
		System.out.println("You fufilled only : " + valid + " "
				+ "criteria. Please fufill at least 3 out of 4 criteria.");
		return false;
	}
}
