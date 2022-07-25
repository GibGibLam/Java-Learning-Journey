package com.fdmgroup.algo_ex_2;

import java.util.Arrays;

public class Qn2 {
	public static void main(String[] args) {
		String string = "radar";
		String string2 = "word";
		System.out.println(isPalindrome(string));
		System.out.println(isPalindrome(string2));
	}

	private static boolean isPalindrome(String string) {

		char[] stringChar = string.toCharArray();
		int length = stringChar.length - 1;
		char[] reverse = new char[length + 1];
		int j = 0;
		for (int i = length; i > -1; i--) {

			reverse[j] = stringChar[i];

			j++;
		}
		System.out.println(Arrays.toString(reverse));
		System.out.println(Arrays.toString(stringChar));
		if (Arrays.equals(stringChar, reverse)) {
			return true;
		}
		return false;
	}

}
