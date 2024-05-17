
public class SubString_isPresent {
	public static boolean isSubString(String main,String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}

	public static void main(String[] args) {
System.out.println(isSubString("Automation testing", "testing"));
System.out.println(isSubString("welcome to Java;","java"));
	}

}
