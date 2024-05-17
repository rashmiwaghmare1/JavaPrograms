import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
int a[]= {1,4,2,5,8,6};
System.out.println("print array elements");
for(int b:a) {
	System.out.println(b);
}
Arrays.sort(a);
System.out.println("after sorting array elements");
for(int b:a) {
	System.out.println(b);
}

	}

}
