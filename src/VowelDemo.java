import java.util.HashMap;

import javax.management.monitor.CounterMonitor;

public class VowelDemo {

	public static void main(String[] args) {
String string="Hellow";
int counter[][]=new int[5][5];

for(int i=0;i<string.length();i++) {
	char ch=string.charAt(i);
	if(ch=='a'&& ch=='A') {
		counter[0][0]++;
	}
	if(ch=='e'&& ch=='E') {
		counter[1][1]++;
	}if(ch=='i'&& ch=='I') {
		counter[2][2]++;
	}if(ch=='o'&& ch=='O') {
		counter[3][3]++;
	}if(ch=='u'&& ch=='U') {
		counter[4][4]++;
	}
}
System.out.println(counter[0][0]);
System.out.println(counter[1][1]);
System.out.println(counter[2][2]);
System.out.println(counter[3][3]);
System.out.println(counter[4][4]);


	}

}
