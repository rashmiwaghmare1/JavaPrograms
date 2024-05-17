import java.util.Arrays;

public class AllZeroesToLeft {
private static int[] shiftzero(int a[]){
	if(a.length==1) {
		return a;
	}
	int count=a.length-1;
	int newarray[]=new int[a.length];
	for(int number:a) {
		if(number!=0) {
			newarray[count]=number;
			count--;
		}
	}
return newarray;
}
	public static void main(String[] args) {
		int i[]=new int[]{10,0,20,0,0,30,0};
		System.out.println(Arrays.toString(shiftzero(i)));

	}

}
