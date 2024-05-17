
public class Stringconversion {

	public static void main(String[] args) {
String string="$10";
String string2="$20";
String string11=string.substring(1,3);
String string22=string2.substring(1,3);
int i1=Integer.parseInt(string11);
int i2=Integer.parseInt(string22);
int i3=i1+i2;
System.out.println("$"+i3);

	}

}
