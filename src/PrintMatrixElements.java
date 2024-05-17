import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrixElements {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("please enter row size");
int row=sc.nextInt();
System.out.println("Please enter column size");
int column=sc.nextInt();
int matrix[][]=new int [row][column];
int matrix2[][]=new int[row][column];
int sum[][]=new int[row][column];
System.out.println("please enter matrix elements");
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		matrix[i][j]=sc.nextInt();
	}
}
System.out.println("please enter matrix2 elements");
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		matrix2[i][j]=sc.nextInt();
	}
}
System.out.println("print matrix data");
for(int r[]:matrix) {
	System.out.println(Arrays.toString(r));
	
}
System.out.println("print matrix2 data");
for(int r[]:matrix) {
	System.out.println(Arrays.toString(r));
	
}
System.out.println("su");
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		sum[i][j]=matrix[i][j]+matrix2[i][j];
		System.out.print(sum[i][j]+" ");
	}
	System.out.println();
}
System.out.println("print matrix in different format");
System.out.println(Arrays.deepToString(sum));




}
}