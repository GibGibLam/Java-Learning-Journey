package qn15;

public class Qn15 extends Abstract15{
public static void main(String[] args) {
	Qn15 q = new Qn15();
	q.myMethod();
}

@Override
public void myMethod() {
	System.out.println("you override");
}
}
