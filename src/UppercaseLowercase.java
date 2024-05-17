
public class UppercaseLowercase {

	public static void main(String[] args) {
		String string="Basmati Rice";
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		for(int i=0;i<string.length();i++) {
			char ch=	string.charAt(i);
			if(ch>='a'&& ch<='z') {
				lowercaseCount++;
			}
			else if(ch>='A'&& ch<='Z') {
				uppercaseCount++;
			}
		}
		System.out.println("lowercaseCount ="+lowercaseCount);
		System.out.println("uppercaseCount ="+uppercaseCount);

	}

}
