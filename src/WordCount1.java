
public class WordCount1 {

	public static void main(String[] args) {
String string="Hellow World";
int count=1;
string=string.replaceAll("//s", " ");
for(int i=0;i<string.length();i++) {
	if(string.charAt(i)==' '&& (string.charAt(i+1)!=' ')) {
	count++;
	}
}
System.out.println(count);
	}

}
