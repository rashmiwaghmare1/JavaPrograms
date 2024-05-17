import java.util.Arrays;

public class RotatetoRight {

	public static void main(String[] args) {
int a[]= {10,20,30,40,50};
int size=a.length;
int no=3;
for(int i=1;i<=no;i++) {
	int last=a[size-1];
	for(int j=a.length-1;j>=0;j--) {
		a[j]=a[j-1];
	}
	a[0]=last;
}
System.out.println(Arrays.toString(a));
	}

}
