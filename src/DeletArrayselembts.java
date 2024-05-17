
public class DeletArrayselembts {

	public static void main(String[] args) {
int a[]= {1,2,3,4};
int element=3;
for(int i=0;i<a.length;i++) {
	if(a[i]==element) {
		for(int j=i;j<a.length-1;j++) {
			a[j]=a[j+1];
		}
	}
}
for(int i=0;i<a.length-1;i++) {
	System.out.println(a[i]);
}
	}

}
