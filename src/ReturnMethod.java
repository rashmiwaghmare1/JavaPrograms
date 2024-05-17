
public class ReturnMethod {
	private static boolean array(int a[]) {
		if(a.length==5) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(array(a));


}
}