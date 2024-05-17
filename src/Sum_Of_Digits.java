import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_Of_Digits {

	public static void main(String[] args) {
String string="rASHMI12";
String string2=string.substring(0,2);
System.out.println(string2);
int no=Integer.parseInt(string2);

int sum=0;
while(no>0) {
	sum=sum+no%10;
	no=no/10;
}
System.out.println(sum);

	}

}
