import java.util.Arrays;

public class Shiftzerotoright {
	public static int[] getElement(int a[]) {
		if(a.length==1) {
		return a;
		}
		int count=0;
		int newarray[]=new int[a.length];
		for(int number:a)
		if(number!=0) {
			newarray[count]=number;
			count++;
		}
		return newarray;
		
		
	}

	public static void main(String[] args) {
		int a[]= {1,0,4,0,2,0,5,6};
		getElement(a);
		System.out.println(Arrays.toString(getElement(a)));
		
		
		
		
	}
}