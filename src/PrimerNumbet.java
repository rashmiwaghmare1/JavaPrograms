
public class PrimerNumbet {

	public static void main(String[] args) {
for(int no=1;no<=100;no++) {
	int count=0;
	for(int i=2;i<no-1;i++) {
		if(no%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.print(no+" ");
	}
}
	}
}
