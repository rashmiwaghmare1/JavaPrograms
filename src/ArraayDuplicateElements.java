
public class ArraayDuplicateElements {

	public static void main(String[] args) {
int a[]= {10,20,20,30,30,30,40};
int[] temp=new int[a.length] ;
int j=0;
for(int i=0;i<a.length-1;i++) {
	if(a[i]!=a[i+1]) {
		temp[j]=a[i];
		j++;
		
	}
	
}
temp[j]=a[a.length-1];
for(int i=0;i<temp.length;i++) {
	System.out.println(temp[i]+ " "+"length of elements"+temp.length);
}

	}

}
