package thiskeyword;

public class ThiscurrentmethodInvoke2 {

	void Display() {
		System.out.println("hello");
	}
	void show() {
		this.Display();//by default this keyword is taken.
	}
	public static void main(String[] args) {
		ThiscurrentmethodInvoke2 tcm=new ThiscurrentmethodInvoke2();
		tcm.show();

	}

}
