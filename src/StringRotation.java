
public class StringRotation {

	public static void main(String[] args) {
String string="abcd";
String string2="1123";
String string3=string+string2;
if(string3.indexOf(string2)!=-1) {
	System.out.println("rotation of string is present");
}
else {
	System.out.println("rotation of string is not  present");
}

}
}