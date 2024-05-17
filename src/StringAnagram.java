import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
String a="Silent";
String b="Listen";
char ch[]=a.toLowerCase().toCharArray();
char ch2[]=b.toLowerCase().toCharArray();
Arrays.sort(ch);
Arrays.sort(ch2);
if(Arrays.equals(ch, ch2)) {
	System.out.println("String are anagram");
}
else {
	System.out.println("String are not anagram");
}

	}

}
