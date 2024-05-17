import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoJava {

	public static void main(String[] args) {
		String st="Hellow java";
HashMap<Character, Integer> map=new HashMap<>();
for(int i=0;i<st.length();i++) {
	char ch=st.charAt(i);
	if(map.containsKey(ch)) {
		map.put(ch, map.get(ch)+1);
	}
	else {
		map.put(ch, 1);
	}
	
}

Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
for(Map.Entry<Character, Integer>entry:entrySet) {
	if(entry.getValue()>1){
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
}

	}

}
