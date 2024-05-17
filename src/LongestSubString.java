import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubString {
	public static void main(String[] args) {
		String string="abbac";
		longestSubString(string);
	}
	public static void longestSubString(String s) {
		String longestString=null;
		int longestStringLength=0;
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			char ch=a[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}
			else {
i=map.get(ch);
map.clear();

			}
			if(map.size()>longestStringLength) {
				longestStringLength=map.size();
				longestString=map.keySet().toString();
				
			}
			
		}
		System.out.println(longestString);
		System.out.println(longestStringLength);
	}

	
		
	}


