package qn3_foobarqix;

public class FooBarQix {

	public void fooBarQix(String num) {

		int number = Integer.parseInt(num);
		String result = "";

		if (number % 3 == 0)
			result += "Foo";

		if (number % 5 == 0)
			result += "Bar";

		if (number % 7 == 0)
			result += "Qix";

		for (int i = 0; i < num.length(); i++) {
			char num1 = num.charAt(i);
			if (num1 == '3') {
				result += "Foo";
			}

			if (num1 == ('5')) {
				result += "Bar";
			}

			if (num1 == '7') {
				result += "Qix";
			}
			if (num1 == '0') {
				result += "*";
			}

		}

		System.out.println(result);
	}

}
