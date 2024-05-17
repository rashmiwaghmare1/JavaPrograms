import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Spliterator.OfPrimitive;
import java.util.Set;

public class DescendingOrder {

	public static void main(String[] args) {
String string="Hellow";
HashMap<Character, Integer>map=new HashMap<>();
for(int i=0;i<string.length();i++) {
char c=	string.charAt(i);
Integer value=map.get(c);
if(value!=null) {
	map.put(c, new Integer(value)+1);
}else {
	map.put(c, 1);
}

}
Set<Entry<Character,Integer>>entrySet=map.entrySet();
List<Entry<Character, Integer>>list=new ArrayList<>(entrySet);
Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		return o2.getValue().compareTo(o1.getValue());
	}
});
for(Entry<Character, Integer>entrylist:list) {
	System.out.println("The Frequency occurancy of "+entrylist.getKey()+entrylist.getValue());
}
	}

}
