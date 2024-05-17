package staticKeyword;

public class Employee {
    int empid;
    String name;
    static String company="SP";// becoz of Static no need to write constantly like empid and name
    
    Employee(int empid, String name){
    	this.empid=empid;
    	this.name=name;
    	//this.company=company;
    }
    
    void display() {
    	System.out.println(empid+" "+name+" "+company);
    }
	public static void main(String[] args) {
		Employee e1=new Employee(1, "Suraj");
		e1.display();
		Employee e2=new Employee(2, "Swapnil");
		e2.display();
		Employee e3=new Employee(3, "Tushar");
		e3.display();

	}

}
