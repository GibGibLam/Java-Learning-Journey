
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		calculator calc = new calculator();
		int sum = calc.add(2, 3);
		calc.printSum(sum);
	}

}