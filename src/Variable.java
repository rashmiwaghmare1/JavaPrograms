
public class Variable {
	private int a ;
	
public int  gettermethod() {
	return a;
	
}
public void settermethod(int x) {
	a=x;
	
}
	public static void main(String[] args) {
Variable variable=new Variable();
variable.settermethod(10);
System.out.println(variable.gettermethod());
	}

}
