package qn4;

public class AppQn4 extends Qn4{
	
	public static void main(String[] args) {
		AppQn4 q4 = new AppQn4("fdsf", "fdsfd");
		
		System.out.println(q4.getName() + q4.getMember());
	}

	public AppQn4(String name, String member) {
		super(name, member);
		
	}

}
