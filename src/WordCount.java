import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
String string="Welcome to java";
String[] st=string.split(" ");
HashMap<String , Integer>map=new HashMap<>();
for(String st2:st) {
	if(map.containsKey(st2)) {
		map.put(st2, map.get(st2)+1);
	}
	else {
		map.put(st2, 1);
	}
}
System.out.println(map);
	}

}
