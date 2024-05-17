package thiskeyword;

public class ArgumentMethod {

	void m1(ArgumentMethod am) {
		System.out.println("I am m1 method");
	}
	
	void m2() {
		m1(this);
	}
	public static void main(String[] args) {
		ArgumentMethod am = new ArgumentMethod();
		am.m2();
		

	}

}
