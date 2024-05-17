
public class CheckArraysorted {
	
	private static boolean isSorted(int a[]) {
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++) 
				if(a[j]<a[i]) 
					return false;
					return true;
				
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,10,6};
		System.out.println(isSorted(a));

	}
	

}
