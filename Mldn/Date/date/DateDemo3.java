package date;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo3 {
   public static void main(String args[]){
	   DateFormat d1 = null;
	   DateFormat d2 = null;
	   d1 = DateFormat.getDateInstance();
	   d2 = DateFormat.getDateTimeInstance();
	   System.out.println(d1.format(new Date()));
	   System.out.println(d2.format(new Date()));
   }
	
}
