
public class SStringClassMethods {

	public static void main(String[] args) {
String string="Welcome to java";
int count=1;
for(int i=0;i<=string.length();i++) {
if(string.charAt(i)==' '&& string.charAt(i+1)!=' ') {
	count++;
}
	
	}
System.out.println(count);
	}
}


