import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		String st="Hellow java";
TreeMap<Character, Integer>map=new TreeMap<>();
for(int i=0;i<st.length();i++) {
	char c=st.charAt(i);
	if(map.containsKey(c)) {
		map.put(c,map.get(c)+1) ;
	}
	else {
		map.put(c, 1);
	
	}
}
for(Entry<Character, Integer>entryset:map.entrySet()) {
	System.out.println(entryset.getKey()+entryset.getValue());
}
	}

}
