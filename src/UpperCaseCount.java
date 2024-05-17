
public class UpperCaseCount {

	public static void main(String[] args) {
String string="Hellow Java";
int count=0;
int lowercount=0;
for(int i=0;i<string.length();i++) {
char ch=	string.charAt(i);

if(ch>65 && ch<97 ) {
	count++;
}
else if(ch>90 && ch<122) {
lowercount++;
}

}
System.out.println(count);
System.out.println(lowercount);
	}

}
