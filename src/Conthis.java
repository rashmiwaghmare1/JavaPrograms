
public class Conthis {

		public Conthis() {
			this(2);
			System.out.println("This is default constructor");
			
		}
		public Conthis(int a) {
			
			System.out.println("This is parametirize");
		}
	
	public static void main(String[]args) {
		Conthis conthis=new Conthis();
	}


}