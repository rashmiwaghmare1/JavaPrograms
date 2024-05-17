import java.util.Scanner;

public class ArrayElementsPrint {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter array size");
		int no=scanner.nextInt();
		int a[]=new int[no];
		System.out.println("enter array elements");
		for(int i=0;i<no;i++) {
			a[i]=scanner.nextInt();
		}
		System.out.println("print array elements");
		for(int i=0;i<no;i++) {
			System.out.print(a[i]+ " ");
		}
		
		
}
}