import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ArraysSum {

	public static void main(String[] args) {
int a[]= {1,2,4,5};
int sum=0;
int sum2=0;
for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
}
System.out.println(sum);
for(int i=1;i<=5;i++) {
	sum2=sum2+i;
}
System.out.println(sum2);
System.out.println("Missing elements found"+(sum2-sum));


	}

}
