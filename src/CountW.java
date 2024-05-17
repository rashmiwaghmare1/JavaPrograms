import java.sql.Struct;

public class CountW {

	public static void main(String[] args) {
String string="Welcome to exclipse";



int count=0;
for(int i=string.length()-1;i>=0;i--){
	
	if(string.charAt(i)!=' ' ){
		
	
		count++;
	}
	else {
	break;
}


	}
System.out.println(count);

}
}