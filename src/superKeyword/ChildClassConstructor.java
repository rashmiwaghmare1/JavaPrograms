package superKeyword;

public class ChildClassConstructor extends ParentClassConstructor{

	ChildClassConstructor(){
		super();// by default also taken by compiler
		System.out.println("I am Child Class Constructor");
	}
	
	public static void main(String[] args) {
		ChildClassConstructor cc= new ChildClassConstructor();

	}

}
