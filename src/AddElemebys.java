import java.util.Arrays;

public class AddElemebys {

	public static void main(String[] args) {
int a[]= {1,2,4,5};
int pos=3;
int element=6;
for(int i=a.length-1;i>=pos-1;i--) {
	a[i]=a[i-1];
}
a[pos-1]=element;
System.out.println(Arrays.toString(a));
	}

}
