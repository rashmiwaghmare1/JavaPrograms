import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
String string=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
String reportName="Report";
System.out.println(reportName+" "+string);
	}

}
