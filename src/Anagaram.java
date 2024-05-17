import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		System.out.println(check("Silent", "Listen"));

	}
public static boolean check(String s,String s2) {
if(s.length()!=s2.length()) {
	return false;
}
else {
char ch[]=	s.toLowerCase().toCharArray();
char ch2[]=s.toLowerCase().toCharArray();
Arrays.sort(ch);
Arrays.sort(ch2);
return Arrays.equals(ch, ch2);
}
	}

}
