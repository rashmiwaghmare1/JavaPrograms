import java.util.Arrays;

public class AngramOrNot {
private static boolean isAnagram(String s1,String s2) {
	if((s1.length()!=s2.length()) ){
		System.out.println("String are not anagram");
		return false;
	}
	else {
	char ch[]=	s1.toLowerCase().toCharArray();
	char ch2[]=s2.toLowerCase().toCharArray();
	Arrays.sort(ch);
	Arrays.sort(ch2);
	System.out.println("strings are Anagram");
return	Arrays.equals(ch, ch2);
}
	
	
}
	public static void main(String[] args) {
isAnagram("Listen", "Silent");
	}

}
