import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterOccurance {

	public static void main(String[] args) {
String string="Universe";
char ch[]=string.toCharArray();
HashMap< Character, Integer>map=new HashMap<>();
for(Character ch2:ch) {
if(map.containsKey(ch2)) {
	map.put(ch2, map.get(ch2)+1);
}
else {
	map.put(ch2, 1);
}
}
Set<Map.Entry<Character, Integer>>entrySet=map.entrySet();
for(Map.Entry<Character, Integer>entry:entrySet) {
	if(entry.getValue()>1) {
		System.out.println(entry.getKey()+ entry.getValue());
	}
}
	}

	}
	
