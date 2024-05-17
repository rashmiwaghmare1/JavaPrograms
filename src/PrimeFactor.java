import java.util.HashSet;

public class PrimeFactor {

	public static void main(String[] args) {
int no=315;
HashSet<Integer>set=new HashSet<>();
for(int i=2;i<=no;i++) {
	int temp=0;
	while(no%i==0) {
		set.add(i);
		no=no/i;
	}
	}
int max=0;
for(Integer s:set) {
	if(s>max) {
		max=s;
	System.out.println(max);
	
	}
	
	}

}
	}


