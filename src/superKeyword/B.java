package superKeyword;

public class B extends A {

	int a=20;
	void m1() {
		System.out.println("I am m1 from B class");
	}
	
	void m2() {// See the Difference in this method
		m1();
		System.out.println("I am child class method in m2");
		super.m1();
	}
	
	// The below method is used to refer parent class instance variable.
//	void show(int a) {
//		System.out.println(a);
//		System.out.println(this.a);// this Keyword => a=20 not 30
//		System.out.println(super.a);// super keyword=> a=10 from Parent class A.
//	}
	public static void main(String[] args) {
		B b =new B();
		//b.show(30);
		b.m2();

	}

}
