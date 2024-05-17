import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
TreeMap<Integer,String> map=new TreeMap<>();
map.put(1, "Rashmi");
map.put(2, "Waghmare");
System.out.println(map);
System.out.println(map.ceilingEntry(2));
System.out.println(map.ceilingKey(1));
System.out.println(map.clone());
System.out.println(map.headMap(2));
System.out.println(map.higherEntry(1));
	}

}
