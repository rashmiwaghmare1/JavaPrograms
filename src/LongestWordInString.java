
public class LongestWordInString {
	private static String longeString(String string) {
	//String string="Welcome to java";
String string2[]=	string.split(" ");
String longestWord=" ";
for(String w:string2) {
	if(w.length()>longestWord.length()) {
		longestWord=w;
	}
}

return longestWord;
}	
	public static void main(String[] args) {
		String string="Law of Attraction";
		System.out.println(longeString(string));
	}
	}

	
