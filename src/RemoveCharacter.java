
public class RemoveCharacter {

	public static void main(String[] args) {
		String string="java";
		for(int i=0;i<string.length();i++) {
			char	ch=string.charAt(i);
			char ch2=string.charAt(i+1);

			string=	string.replaceAll(("[ch==ch2]"), " ");
		}
		System.out.println(string);
	}

}
