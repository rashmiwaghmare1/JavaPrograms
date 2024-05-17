package thiskeyword;

public class ClassConstructor {

	ClassConstructor(){
		System.out.println("No Argument Constructor");
	}
	ClassConstructor(int x){
		this();
		System.out.println("Parametrized constructor");
	}

	public static void main(String[] args) {
		ClassConstructor cc= new ClassConstructor(5);

	}

}
