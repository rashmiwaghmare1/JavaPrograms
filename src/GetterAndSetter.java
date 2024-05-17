
public class GetterAndSetter {
	private static int a;
	private static String b;
	public  static int geta() {
		return a;
		
	}
	public static void seta(int c) {
		c=a;
	}

	public static void main(String[] args) {
	GetterAndSetter.seta(a=10);
	System.out.println(GetterAndSetter.geta());
		
	}

}
