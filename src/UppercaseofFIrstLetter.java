
public class UppercaseofFIrstLetter {

	public static void main(String[] args) {
String string="welcome to java";
String str[]=string.split(" ");
StringBuilder sBuilder=new StringBuilder();
for(String str2:str) {
	String firstletterString=str2.substring(0,1);
	String remainingString=str2.substring(1);
	sBuilder=sBuilder.append(firstletterString.toUpperCase()).append(remainingString).append(" ");
	
}
System.out.println(sBuilder);
}
}