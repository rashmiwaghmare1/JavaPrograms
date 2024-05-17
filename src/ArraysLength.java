
public class ArraysLength {

	public static void main(String[] args) {
String st="rashmi waghmare";
st=st.trim();
int count=0;
for(int i=st.length()-1;i>=0;i--) {
	char ch=st.charAt(i);
	if(ch==' ') {
		break;
	}
	else {
		count++;
	}
}
System.out.println(count);
	}
}

