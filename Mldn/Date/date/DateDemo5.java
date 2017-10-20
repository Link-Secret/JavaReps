package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo5 {

	public static void main(String args[]){
		String strDate = "2017-9-20 9:06:56.244";
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
		String pat2 = "yyyy年MM月dd天HH时mm分ss秒SSS毫秒";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d = null;
		try {
			d = sdf1.parse(strDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}
	
}
