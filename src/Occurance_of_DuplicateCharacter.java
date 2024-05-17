import java.util.LinkedHashSet;

public class Occurance_of_DuplicateCharacter {

	public static void main(String[] args) {		
		String string="java";
		
LinkedHashSet<Character>set=new LinkedHashSet<>();
for(int i=0;i<string.length();i++) {
	char ch=string.charAt(i);
	set.add(ch);
	}

	System.out.print(set.toString());
}

}