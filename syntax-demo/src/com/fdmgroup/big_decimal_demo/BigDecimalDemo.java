package com.fdmgroup.big_decimal_demo;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		//Primitive type
		System.out.println(3.1 - 3);
		
		//Reference type
		BigDecimal bd1 = new BigDecimal("3.1");
		BigDecimal bd2 = new BigDecimal("3.0");
		System.out.println(bd1.subtract(bd2));
	}
}
