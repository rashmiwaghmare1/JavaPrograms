import java.util.Scanner;

import javax.naming.AuthenticationException;

public class ArraysSorting {

	public static void main(String[] args) {

Scanner scanner=new Scanner(System.in) ;
System.out.println("enter the size of array");
int size=scanner.nextInt();
int a[]=new int[size];
System.out.println("enter the value of arrays");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]=scanner.nextInt());
}
System.out.println("Print arrays elements");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+ " ");
}
	}

}
