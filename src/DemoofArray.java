import java.util.Arrays;

public class DemoofArray {

	public static void main(String[] args) {
int a[]=new int[]{1,0,4,3};
Arrays.sort(a);
System.out.println("After sorting of arrays");
System.out.println(Arrays.toString(a));
int b[]=Arrays.copyOf(a, 4);
System.out.println("copy all the elements of a in b");
System.out.println(Arrays.toString(b));
System.out.println(Arrays.equals(a, b));
String string=new String("Rashmi@1234");
Integer c=Integer.valueOf(string.substring(7,string.length()));
System.out.println(c);
int count=0;
while(c>0) {
	
	c=c/10;
	
	count++;
	
	if(count%2==0) {
		System.out.print(count+" ");
	}
}

	}

}
