package thiskeyword;

public class ThisKeyword {

	int i;

	 void SetValues(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.SetValues(100);
		tk.show();

	}

}



