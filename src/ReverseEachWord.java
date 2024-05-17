
public class ReverseEachWord {

	public static void main(String[] args) {
		String string="welcome to java";
		String reverseString=" ";
		String words[]=	string.split(" ");
		for(String w:words) {
			String reversewords=" ";
			for(int i=w.length()-1;i>=0;i--) {
				reversewords=reversewords+w.charAt(i);
			}
			reverseString=reverseString+reversewords;
		}
		System.out.println(reverseString.trim());
	}
}