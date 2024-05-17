
public class PalindromeString {

	public static void main(String[] args) {
String string="radar";
String org_strString=string;
String revString=" ";
for(int i=string.length()-1;i>=0;i--) {
	revString=revString+string.charAt(i);
}
org_strString=org_strString.trim();
revString=revString.trim();
if(org_strString.equals(revString)) {
	System.out.println("String is palidrome");
}
else {
	System.out.println("String is not palindrome");
}
	}

}
