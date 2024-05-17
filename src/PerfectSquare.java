import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
for(int i=1;i<=no;i++) {
	if(i*i==no) {
		System.out.println("Perfect square "+i);
	}
}

	}

}
