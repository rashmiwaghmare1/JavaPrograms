
public class Word_count {

	public static void main(String[]args){
String string="welcome to java";
String st[]=string.split(" ");
StringBuffer sBuffer=new StringBuffer();
for(String st2:st) {
String firString=st2.substring(0,1);
String remString=st2.substring(1,st2.length());
sBuffer=sBuffer.append(firString.toUpperCase()).append(remString).append(" ");
	}
System.out.println(sBuffer);
	}
}
