import java.util.HashMap;
import java.util.Set;

public class CountOfDigit {

	public static void getDigit(long number) {
		HashMap<Long, Integer>map=new HashMap<>();
		while(number!=0) {
			long lastdigit=number%10;
			if(map.containsKey(lastdigit)) {
			map.put(lastdigit,map.get(lastdigit)+1);
		}
			else {
				map.put(lastdigit, 1);
			}
			number=number/10;
	}
		Set<Long>keys=map.keySet();
		for(Long key:keys) {
			System.out.println(key+ "="  + map.get(key));
		}
	}
	public static void main(String[] args) {
getDigit(9998);
	}

}
