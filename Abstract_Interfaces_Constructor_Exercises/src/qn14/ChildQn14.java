package qn14;

public class ChildQn14 extends ParentQn14 {
	public static void main(String[] args) {
		int num = 5;
		ChildQn14 q = new ChildQn14(num);
	}

	public ChildQn14(int num) {
		super(num);
	}

}
