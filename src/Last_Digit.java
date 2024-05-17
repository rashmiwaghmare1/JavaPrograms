
public class Last_Digit {

	public static void main(String[] args) {
int no=123;
int lastno=no%10;
int firstno=no;
while(firstno>=10) {
	firstno=firstno/10;
	
}
System.out.println(firstno);
System.out.println(lastno);
System.out.println("sum of firstno and lastno"+" "+(firstno+lastno));
	}

}
