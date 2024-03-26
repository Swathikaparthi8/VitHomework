package JavaHomeWork2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class java15 {

	public static void main(String[] args) {
	DateFormat DF = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
	Date DT = new Date();
	System.out.println(DF.format(DT));
	}

}
