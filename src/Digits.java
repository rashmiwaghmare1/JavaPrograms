import java.util.HashMap;
import java.util.Set;

public class Digits {

	
	public static void getCount(long no) {
		HashMap<Long ,Integer>map=new HashMap<>();
	
		while(no!=0) {
			long lastno =no%10;
			if(map.containsKey(lastno)) {
				map.put( lastno, map.get(lastno)+1);
			}
			else {
				map.put( lastno,1);
			}
			no=no/10;
		}
		Set<Long >keySet=map.keySet();
		for(Long keys:keySet) {
			System.out.println(keys+"="+map.get(keys));
		}
	}
	public static void main(String[] args) {
		getCount(12451245);
	}
	
}
