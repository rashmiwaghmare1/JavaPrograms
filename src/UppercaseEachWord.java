
public class UppercaseEachWord {
private static String uppercaseFirst(String s1) {
	String s2[]=s1.split(" ");
	StringBuilder sBuilder=new StringBuilder();
	for(String s3:s2) {
	String ch=	s3.toUpperCase().substring(0,1);
	String ch2=s3.substring(1);
sBuilder=	sBuilder.append(ch).append(ch2).append(" ");
	}
	System.out.println(sBuilder);
	return sBuilder.toString();
	
}
	public static void main(String[] args) {
		uppercaseFirst("universe is great");

	}

}
