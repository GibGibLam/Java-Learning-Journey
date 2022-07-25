package qn13;

public class Qn13 extends ExtendsQn{
public static void main(String[] args) {
	Qn13 q = new Qn13();
	q.myMethod(5);
	System.out.println(q.integer);
}
	@Override
	public void myMethod(Integer integer) {
		super.myMethod(integer + 55);
		System.out.println("it work "+integer);
	}

	
}
