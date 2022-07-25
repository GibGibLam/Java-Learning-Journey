package com.fdmgroup.mutable_string_demo;

public class MutableStringDemo {
	public static void main(String[] args) {
		//String - immutable
		String str = "Hongwei";
		str+= " Chow";
		System.out.println(str);

		//StringBuffer - mutable version of String
		StringBuffer strBuffer = new StringBuffer("Hongwei");
		strBuffer.append(" Chow");
		System.out.println(strBuffer);
		
		// Comparing String and StringBuffer
		//Output in numbers shows the time to produce it
		long t1 =System.currentTimeMillis();
		for (int i=0;i<100_000; i++)
			str += "a";
		System.out.println("String" + (System.currentTimeMillis() - t1));
		
		t1 = System.currentTimeMillis();
		for (int i=0;i<100_000; i++)
			strBuffer.append ("a");
		System.out.println("StringBuffer" + (System.currentTimeMillis() - t1));
		
	}
}
