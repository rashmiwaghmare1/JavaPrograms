package staticKeyword;

public class StaticMethod {

	void m1() {
		System.out.println("I am m1 instance method");
	}
	static void m2() {
		System.out.println("I am m2 Static method ");
	}
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.m1();
		StaticMethod.m2();// no need to create object directly by ClassName we can Call static Method.

	}

}
