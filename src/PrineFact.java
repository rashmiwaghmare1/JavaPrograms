import java.util.HashSet;

public class PrineFact {

	public static void main(String[] args) {
int no=315;
HashSet<Integer>set=new HashSet<>();
for(int i=2;i<=no;i++) {
while(no%i==0) {
set.add(i)	;
no=no/i;
}
	}
int maxprime=0;
for(Integer n:set) {
	System.out.println(n);
	if(n>maxprime) {
		maxprime=n;
	}
}
System.out.println("Maxprime numbe"+maxprime);

}
}
