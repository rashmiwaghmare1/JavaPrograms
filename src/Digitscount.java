import java.util.Scanner;

public class Digitscount {

	public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
System.out.println("Enter the number");
int no=scanner.nextInt();

int lastDigit=no%10;
int firstDigit=no;
while(firstDigit>=10) {
	firstDigit=firstDigit/10;
}
int sum=0;

System.out.println("LastDigit"+lastDigit);
System.out.println("FirstDigit"+firstDigit);
System.out.println(sum=lastDigit+firstDigit);

	}

}
