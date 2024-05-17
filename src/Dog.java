
public class Dog extends Animal {
	public Dog() {
	super();
		
	}int a=20;
	public void show() {
		System.out.println(a);
		System.out.println(super.a);
	}
public void sound() {
 
	System.out.println("Dog is barking");
	}
	
	

	public static void main(String[] args) {
Dog dgDog=new Dog();
dgDog.sound();
dgDog.eating();
dgDog.show();
	}

}
