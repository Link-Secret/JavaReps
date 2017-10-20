package date2;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateTime{
	private SimpleDateFormat sdf = null;
	public String getDate(){
		this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		return this.sdf.format(new Date());
	}
	public String getTimeDate(){
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return this.sdf.format(new Date());
	}
	
}

public class DateDemo7 {
    public static void main(String args[]){
    	DateTime dt = new DateTime();
    	System.out.println(dt.getDate());
    	System.out.println(dt.getTimeDate());
    }
}
