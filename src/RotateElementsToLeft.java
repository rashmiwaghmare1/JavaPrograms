import java.util.Arrays;

public class RotateElementsToLeft {

	public static void main(String[] args) {
int a[]= {10,20,30,40,50};
int no=3;
int size=a.length-1;
for(int i=1;i<=no;i++) {
	int first=a[0];

for(int j=0;j<a.length-1;j++) {
	a[j]=a[j+1];
}
a[size-1]=first;
}
System.out.println(Arrays.toString(a));
	}

}
