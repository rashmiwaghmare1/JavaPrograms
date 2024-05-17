
public class UppercaseFirst {

	public static void main(String[] args) {
String string="welcome to java";
String[]st1=string.split(" ");
StringBuffer sBuffer=new StringBuffer();
for(String st2:st1) {
String first=st2.substring(0,1);
String remString=st2.substring(1,st2.length());
sBuffer=sBuffer.append(first.toUpperCase()).append(remString).append(" ");

}
System.out.println(sBuffer);
	}

}
