
public class CapitalizefirstLetter {

	public static void main(String[] args) {
		String string="welcome to java";
		String st[]=string.split(" ");
		StringBuilder sBuilder=new StringBuilder(" ");
		for(String st2:st) {
			String firstletterString=st2.substring(0,1);
			String remainingString=st2.substring(1);
			sBuilder=sBuilder.append(firstletterString.toUpperCase()).append(remainingString).append(" ");
		}

		System.out.println(sBuilder.toString());
	}

}
