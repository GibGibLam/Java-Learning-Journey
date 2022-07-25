package qn2_factorial;

public class FactorialMethod {

	public int factorial2(int i) {
		
		if (i == 0) {
			return 1;
		}
		else {
			return (i*factorial2(i-1));
		}
		
	}
}
