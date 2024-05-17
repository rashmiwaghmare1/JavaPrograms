import java.util.HashMap;

public class Digit_Count {

	public static void main(String[] args) {
HashMap<Character, Integer> map=new HashMap<>();
String string="Welcome to java";
map.put('a', 0);
map.put('e', 0);
map.put('i', 0);
map.put('o', 0);
map.put('u', 0);
for(int i=0;i<string.length()-1;i++) {
	char ch=string.charAt(i);
	if(ch=='a'|| ch=='A') {
		map.put(ch, map.get(ch)+1);
	}
	if(ch=='e'||ch=='E') {
		map.put(ch, map.get(ch)+1);
	}if(ch=='i'|| ch=='I') {
		map.put(ch, map.get(ch)+1);
	}if(ch=='o'|| ch=='O') {
		map.put(ch, map.get(ch)+1);
	}if(ch=='u'|| ch=='U') {
		map.put(ch, map.get(ch)+1);
	}
}
System.out.println("frequency of a is"+map.get('a'));
System.out.println("frequency of e is"+map.get('e'));
System.out.println("frequency of i is"+map.get('i'));
System.out.println("frequency of o is"+map.get('o'));
System.out.println("frequency of u is"+map.get('u'));

	}

}
