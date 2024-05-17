
public class RemoveCharacterString {

	private static void removeCharavcter(String st,char ch) {
		String st2=" ";
		for(int i=0;i<st.length();i++) {
	char	ch2=	st.charAt(i);
		if(ch2!=ch) {
			st2=st2+ch;
		}
		}
		System.out.println(st2);
		System.out.println(st2);
	}
	public static void main(String[] args) {
		removeCharavcter("java",'a');
	
	}

}
