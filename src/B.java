
public class B implements A{
	
	@Override
	public void makemangoShake() {
		System.out.println("for making mangomilkshake mango requried is"+" "+mango+"dozen");
		System.out.println("for making mangomilkshake milk required is"+" "+milk+"litre");
	}	
public static void main(String[] args) {
	B b=new B();
	b.makemangoShake();
}


	

}
