
public class A1  implements I1{
	public void display() {
		System.out.println("this is display method");
	}
	public void show() {
		System.out.println("this is show method inside a interface");
	}

	public static void main(String[] args) {
A1 a1=new A1();
a1.show();
a1.display();
	}

}
