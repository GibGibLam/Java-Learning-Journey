package qn2_factorial;

public class FactorialClient {
	public static void main(String[] args) {

		int n = 7;
		FactorialMethod method = new FactorialMethod();
		int result = method.factorial2(n);
		
		System.out.println("Factorial number of " + n + " is " + result);
	}

}
