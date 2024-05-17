
public class CharacterOfEachWord {

	public static void main(String[] args) {
		String string="Welcome to java";
		char[] ch=string.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			String s=" ";
			while(i<ch.length && ch[i]!=' ') {
				s=s+ch[i];
				i++;
			}
			if(s.length()>=0) 
				
				System.out.println(s+">-"+s.length());
			
		}
}
}