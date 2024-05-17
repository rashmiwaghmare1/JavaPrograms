
public class AddArraList {
private static boolean isSorting(int a[]) {
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[j]<a[i]) { 
		
		return false;
		
		}	
}
}
return true;



	
}

	public static void main(String[] args) {
		int a[]= {10,20,30,40,5};
		System.out.println(isSorting(a));

	}

}
