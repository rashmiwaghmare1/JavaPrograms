package finalKeyword;

public class MainForFinalmethod extends FinalMethod  {//See the Error bcoz of final from parent class

	void m1() {// See the Error bcoz of final.
		System.out.println("I am m1 method from MainForFinalmethod class");
	}
	void m2() {
		System.out.println("I am m2 method");
		
	}
	public static void main(String[] args) {
		MainForFinalmethod mfc =new MainForFinalmethod();
		mfc.m2();
	}

}
