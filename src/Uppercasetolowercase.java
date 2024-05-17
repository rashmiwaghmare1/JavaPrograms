
public class Uppercasetolowercase {

	public static void main(String[] args) {
String string="wELCOME tO jAVA";
for(int i=0;i<string.length();i++) {
	char ch=string.charAt(i);
	if(Character.isLowerCase(ch)) {
		System.out.print(Character.toUpperCase(ch));
	}
	else {
		System.out.print(Character.toLowerCase(ch));
	}
}
	}

}
